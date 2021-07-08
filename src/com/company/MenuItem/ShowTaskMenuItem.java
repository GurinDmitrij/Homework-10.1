package com.company.MenuItem;

import com.company.Menu;
import com.company.TaskList;

public class ShowTaskMenuItem extends Menu {
    private TaskList taskList;

    public ShowTaskMenuItem(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getMenuItem() {
        return "Show all tasks";
    }

    @Override
    public void run() {
        System.out.println("All tasks");
        taskList.ShowTask();
        System.out.println("------------------");
    }
}
