package com.company.MenuItem;

import com.company.Menu;
import com.company.TaskList;

import java.util.Scanner;

public class MarkTaskCompleteMenuItem extends Menu {
    private TaskList taskList;
    private Scanner sc;

    public MarkTaskCompleteMenuItem(TaskList taskList, Scanner sc) {
        this.taskList = taskList;
        this.sc = sc;
    }

    @Override
    public String getMenuItem() {
        return "Mark the task as completion (by number)";
    }

    @Override
    public void run() {
        taskList.ShowTask();
        System.out.println("Enter number of task");
        int index = sc.nextInt()-1;
        sc.nextLine();
        taskList.addIndexTaskComplete(index);
    }
}
