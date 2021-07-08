package com.company;

import com.company.MenuItem.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TaskList tasks = new TaskList();

        Menu[] menu = new Menu[]{
                new AddTaskMenuItem(tasks,sc),
                new ShowTaskMenuItem(tasks),
                new ShowCompletedTaskMenuItem(tasks),
                new ShowUncompletedTaskMenuItem(tasks),
                new MarkTaskCompleteMenuItem(tasks,sc),
                new Menu() {
                    @Override
                    public String getMenuItem() {
                        return "Press 6 to exit";
                    }

                    @Override
                    public void run() {
                        super.run();
                    }
                }

        };//
        while (true) {

            for (int i = 0; i < menu.length; i++) {
                System.out.printf("%d. %s \n", i + 1, menu[i].getMenuItem());
            }
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6){
                break;
            }
            menu[choice - 1].run();

        }





    }

}
