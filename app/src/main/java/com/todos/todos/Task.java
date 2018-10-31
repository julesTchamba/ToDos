package com.todos.todos;

import java.util.Date;

public class Task {

  private String   name ;
  private Date dueDate ;
  private Boolean completed ;

  public Task(String name, Boolean completed, Date dueDate) {
  this.completed = completed;
  this.name = name;
  this.dueDate =dueDate;
  }




    public String getName() {
        return name;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Boolean isCompleted() {
        return completed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
