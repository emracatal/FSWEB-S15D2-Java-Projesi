package com.wit.taskCompany;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getTasks(String name) {
        try {
            if ((name.equalsIgnoreCase("ann"))) {
                getAnnsTasks();
            }
            if ((name.toLowerCase().equals("bob"))) {
                getBobsTasks();
            }
            if ((name.toLowerCase().equals("carol"))) {
                getCarolsTasks();
            }
            if ((name.toLowerCase().equals("all"))) {
                getUnion();
            }
        } catch (Exception ex) {
            System.out.println("enter a valid developer name");
        }return new HashSet<>();
    }

    public Set<Task> getUnion() {
        Set<Task> allTasks = new HashSet<>();
        allTasks.addAll(annsTasks);
        allTasks.addAll(bobsTasks);
        allTasks.addAll(carolsTasks);
        return allTasks;
        //burayı sor
    }

    public Set<Task> getIntersection(Set<Task> firstSet,Set<Task> secondSet){
        Set<Task> intersections = new HashSet<>(firstSet);
        intersections.retainAll(secondSet);
        return intersections;
    }

    public Set<Task> getDifferences(Set<Task> firstSet,Set<Task> secondSet){
        Set<Task> differences = new HashSet<>(firstSet);
        differences.removeAll(secondSet);
        return differences;
    }
}
