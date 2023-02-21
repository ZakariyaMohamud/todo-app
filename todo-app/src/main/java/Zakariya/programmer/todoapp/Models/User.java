package Zakariya.programmer.todoapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User {
    @Id
    private long id;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Todo> todolist = new ArrayList<>();

    public User() {
    }

    public User( String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.todolist = new ArrayList<>();
    }

    public long getId() {
        return id;
    }


    public void setId(long l) {
    }

    public void setPassword(String should_be_hashed) {
    }

    public void setUsername(String abdifatah) {
    }

    public Collection<Todo> getTodoList() {

        return null;
    }
}
