package org.example.controller;

import org.example.model.Task;
import org.example.repo.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/home")
    public String showTaskform(Model model) {
        model.addAttribute("tasks", taskRepository.findAll().
                stream().
                sorted((t1, t2) -> t1.getDate().compareTo(t2.getDate())));
        model.addAttribute("task", new Task());
        return "home";
    }

    @PostMapping("/tasks")
    public String submitTask(@ModelAttribute Task task) {

        taskRepository.save(task);

        return "redirect:/home";
    }

}
