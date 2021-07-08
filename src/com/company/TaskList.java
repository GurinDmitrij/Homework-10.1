package com.company;

import java.util.Arrays;

public class TaskList {
    private String[] taskList = new String[0];

    private int[] completeTaskIndex = new int[0];

    public void addIndexTaskComplete(int index) {
        completeTaskIndex = Arrays.copyOf(completeTaskIndex, completeTaskIndex.length + 1);
        completeTaskIndex[completeTaskIndex.length - 1] = index;
    }

    public void add(String task) {
        taskList = Arrays.copyOf(taskList, taskList.length + 1);
        taskList[taskList.length - 1] = task;
    }
    public String getIndex(int index){
        return taskList[index];
    }
    public void ShowTask(){
        for (int i = 0; i < taskList.length; i++) {
            System.out.printf("%d - %s\n",i+1,taskList[i]);
        }
    }
    public void ShowCompleteTask(){
        for (int j=0;j<completeTaskIndex.length;j++){
            for (int i = 0; i < taskList.length; i++) {
                if (completeTaskIndex[j]==i)
                    System.out.printf("%d - %s\n",j+1,taskList[i]);
            }
        }

    }
    public void ShowUncompletedTask(){

        loop: for (int i = 0; i < taskList.length; i++) {
            for (int taskIndex : completeTaskIndex) {
                if (taskIndex == i) {
                    continue loop;
                }
            }
            System.out.printf("%d - %s\n", i, taskList[i]);
        }


    }
}
