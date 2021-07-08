package com.company.MenuItem;

import com.company.Menu;
import com.company.TaskList;

public class ShowUncompletedTaskMenuItem extends Menu {
    private TaskList taskList;

    public ShowUncompletedTaskMenuItem(TaskList taskList) {
        this.taskList = taskList;
    }

    @Override
    public String getMenuItem() {
        return "Show uncompleted tasks";
    }

    @Override
    public void run() {
        taskList.ShowUncompletedTask();
    }
}
