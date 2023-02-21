package Zakariya.programmer.todoapp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {
    @Id
    private long id;
    private String content;
    private Boolean completed=Boolean.FALSE;

    private User user;



    public Todo( String content, Boolean completed, User user) {
        this.content = content;
        this.completed = completed;
        this.user = user;
    }

    public Todo() {
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
