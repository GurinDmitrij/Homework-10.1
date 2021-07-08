package com.company.MenuItem;


import com.company.Menu;
import com.company.TaskList;

public class ShowCompletedTaskMenuItem extends Menu {
    private TaskList taskList;

    public ShowCompletedTaskMenuItem(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getMenuItem() {
        return "Show completed tasks";
    }

    @Override
    public void run() {
        taskList.ShowCompleteTask();
    }
}
