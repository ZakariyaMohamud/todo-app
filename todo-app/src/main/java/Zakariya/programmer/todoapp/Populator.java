package Zakariya.programmer.todoapp;

import Zakariya.programmer.todoapp.Models.Todo;
import Zakariya.programmer.todoapp.Models.User;
import Zakariya.programmer.todoapp.Repository.todoRepository;
import Zakariya.programmer.todoapp.Repository.userRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {


    private userRepository userRepo;

    private todoRepository todoRepo;

    public Populator(userRepository userRepo, todoRepository todoRepo) {
        this.userRepo = userRepo;
        this.todoRepo = todoRepo;
    }
    @Override
    public void run(String... args) throws Exception {

        User user1 = new User("Zakariya","Mifflin21");
        userRepository.save(user1);
        Todo todo1 = new Todo("GYM",true,user1);
        Todo todo2 = new Todo("",false,user1);
        todoRepository.save(todo1);
        todoRepository.save(todo2);
        userRepository.save(user1);

    }
}
