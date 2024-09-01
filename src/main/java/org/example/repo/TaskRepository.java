package org.example.repo;
import org.bson.types.ObjectId;
import org.example.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, ObjectId> {



}
