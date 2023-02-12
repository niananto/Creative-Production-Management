package views;

import controllers.DesignerController;
import controllers.ProjectController;

public class CSODashboardUI {
    private ProjectController projectController;
    private DesignerController designerController;

    public void displayCompletedTasks(){
        System.out.println("Displaying completed tasks");
    }
    public void displayRunningTasks(){
        System.out.println("Displaying running tasks");
    }
    public void displayProjectCount(){
        System.out.println("Displaying project count");
    }
    public void displaySearchUI(){}
    public void displayTopDesigners(){}
}
