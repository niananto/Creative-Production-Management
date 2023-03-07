package models;

import java.util.List;

public class Designer extends User {
    private List<Task> tasks;
    private List<Tag> tags;
    private List<Expertise> expertise;
    private double salary;

    public boolean upload(Content content) {
        return true;
    }
    public void updateTask(Task task) {}
    public double getRating() {
        return 0;
    }
    public void addTag(Tag tag){
        tags.add(tag);
    }
    public void addTask(Task task){
        tasks.add(task);
    }

    public void addExpertise(Expertise expertise){
        this.expertise.add(expertise);
    }
}
