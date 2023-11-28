package com.wit.taskCompany;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("****************");
        Task task1 = new Task("lcw", "lcw project", "ann", Priority.HIGH, Status.IN_PROGRESS);
        Task task2 = new Task("defacto", "defacto project", "ann", Priority.HIGH, Status.ASSIGNED);
        Task task3 = new Task("trendyol", "trendyol project", "bob", Priority.HIGH, Status.IN_PROGRESS);
        Task task4 = new Task("papara", "papara project", "bob", Priority.HIGH, Status.ASSIGNED);
        Task task5 = new Task("lcw2", "lcw2 project", "carol", Priority.HIGH, Status.ASSIGNED);
        Task task6 = new Task("lcw3", "lcw3 project", "", Priority.HIGH, Status.IN_QUEUE);
        Task task7 = new Task("lcw4", "lcw4 project", "", Priority.HIGH, Status.IN_QUEUE);

        Set<Task> allTasks = new HashSet<>();
        allTasks.add(task1);
        allTasks.add(task2);
        allTasks.add(task3);
        allTasks.add(task4);
        allTasks.add(task5);
        allTasks.add(task6);
        allTasks.add(task7);

        Set<Task> annsTasks = new HashSet<>();
        annsTasks.add(task1);
        annsTasks.add(task2);

        Set<Task> bobsTasks = new HashSet<>();
        bobsTasks.add(task2);
        bobsTasks.add(task3);
        bobsTasks.add(task4);

        Set<Task> carolsTasks = new HashSet<>();
        carolsTasks.add(task5);
        carolsTasks.add(task4);
        carolsTasks.add(task2);


//       TAMAMLA....

    }
}