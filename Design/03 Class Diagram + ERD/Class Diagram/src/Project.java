import java.util.Date;
import java.util.List;

public class Project {
    private Estimation projectEstimation;
    private Date deadline;

    private List<Task> tasks;
    public Project(Estimation projectEstimation) {
        this.projectEstimation = projectEstimation;
    }

    public Estimation getProjectEstimation() {
        return projectEstimation;
    }

    public void setProjectEstimation(Estimation projectEstimation) {
        this.projectEstimation = projectEstimation;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void addTask(Task task){
        tasks.add(task);
    }
}
