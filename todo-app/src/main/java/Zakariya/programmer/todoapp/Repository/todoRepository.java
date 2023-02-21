package Zakariya.programmer.todoapp.Repository;

import Zakariya.programmer.todoapp.Models.Todo;
import org.springframework.data.repository.CrudRepository;


public interface todoRepository extends CrudRepository<Todo,Long> {



}
