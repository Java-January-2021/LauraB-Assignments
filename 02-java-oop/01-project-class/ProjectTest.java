public class ProjectTest{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    
    public static void main(String[] args){

    // Create a ProjectTest file that will test all the functionality
    Project emptyProject = new Project();
    System.out.println(CYAN_BOLD_BRIGHT + "\nConstructor 1  -- Empty Project, should print 'null.'" + RESET);
    System.out.println(RED_BOLD_BRIGHT + emptyProject.getName() + "\n" + RESET); //should print null for an empty project


    Project project2 = new Project("Java Quilt");
    String pitch2 = project2.elevatorPitch(); //invokes elevatorPitch() method of Project.java
    System.out.println(CYAN_BOLD_BRIGHT + "Constructor 2 -- Should print the name of the project only." + RESET);
    System.out.println(project2.getName() + "\n"); //prints only the name of the project.  Constructor 2


    Project project3 = new Project("Java Quilt", "Create a quilt with cup of java in the center and the concepts as the borders.");
    System.out.println(CYAN_BOLD_BRIGHT + "Constructor 3 -- Should print the name of the project and the description." + RESET);
    System.out.println(project3.elevatorPitch() + "\n"); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for project 3

    Project optional1 = new Project("Java Quilt", 250.27, "Create a queen-sized quilt with cup of java in the center and the concepts as the borders.");
    System.out.println(CYAN_BOLD_BRIGHT + "Optional Challenge 1 -- Should print the name of the project, initial cost in parenthesis, and the description." + RESET);
    System.out.println(optional1.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for project 3
    }
}

// NOTE:
//This file is the Executable (Worker Bee)