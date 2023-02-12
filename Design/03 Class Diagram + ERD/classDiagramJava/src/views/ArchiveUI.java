package views;

import controllers.ArchiveController;

public class ArchiveUI {
    private ArchiveController archiveController;
    public void displayCompletedProjects(){
        System.out.println("Displaying completed projects");
    }

    public void displayRejectedProjects(){
        System.out.println("Displaying rejected projects");
    }
}
