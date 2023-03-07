package models;

public class ClientServiceOfficer extends User {
    public void assignTaskToVendor(Task task, Vendor vendor) {
    }

    public void assignTaskToDesigner(Task task, Designer designer) {
    }

    public void createWorkOrder(WorkOrder workOrder) {
    }

    public Estimation createEstimation(Project project){
        return new Estimation();
    }

    public Project createProject(){
        return new Project();
    }

    public void archiveProject(Project project) {}
    public void archiveEstimation(Estimation estimation) {}
    public void rateProject(Project project) {}

    public void addTask(Project project){
        project.addTask(new Task());
    }
}
