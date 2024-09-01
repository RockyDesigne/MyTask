package org.example.model;

import jakarta.persistence.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Objects;

@Document(collection = "tasks")
public class Task {

    @Id
    private ObjectId id;
    private String name;
    private LocalDate date;
    private String description;

    public Task() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task(String name, LocalDate date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) && Objects.equals(date, task.date) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, description);
    }

    public ObjectId getId() {
        return id;
    }
}
