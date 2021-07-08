package com.company.MenuItem;

import com.company.Menu;
import com.company.TaskList;

import java.util.Scanner;

public class AddTaskMenuItem extends Menu {
    private Scanner sc;
    private TaskList taskList;

    public AddTaskMenuItem(TaskList taskList,Scanner sc) {
        this.taskList = taskList;
        this.sc = sc;
    }




    @Override
    public String getMenuItem() {
        return "Add task";
    }


    @Override
    public void run() {
        System.out.println("Enter task");
        String task =sc.nextLine();
        taskList.add(task);


    }
}
