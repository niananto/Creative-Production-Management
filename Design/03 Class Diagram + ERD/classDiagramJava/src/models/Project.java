package models;

import java.util.Date;
import java.util.List;

public class Project {
    private List<Estimation> projectEstimations;
    private Date deadline;

    private List<Task> tasks;
    public void addEstimation(Estimation estimation){
        projectEstimations.add(estimation);
    }

    public void addTask(Task task){
        tasks.add(task);
    }
}
