public class ClientServiceOfficer extends User {
    public void assignTaskToVendor(Task task, Vendor vendor) {
    }

    public void assignTaskToDesigner(Task task, Designer designer) {
    }

    public void createWorkOrder(WorkOrder workOrder) {
    }

    public Estimation createEstimation(){
        return new Estimation();
    }

    public Project createProject(Estimation estimation){
        return new Project(estimation);
    }

    public void archiveProject(Project project) {}
    public void archiveEstimation(Estimation estimation) {}
    public void rateProject(Project project) {}

    public void addTask(Project project){
        project.addTask(new Task());
    }
}
