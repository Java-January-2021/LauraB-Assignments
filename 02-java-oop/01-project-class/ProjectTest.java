public class ProjectTest{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    
    public static void main(String[] args){

    // Create a ProjectTest file that will test all the functionality
    Project emptyProject = new Project();
    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 1  -- Empty Project, should print 'null.'" + RESET);
    System.out.println(RED_BOLD_BRIGHT + emptyProject.getName() + RESET); //should print null for an empty project


    Project javaQuilt = new Project("Java Quilt");
    Project pythonQuilt = new Project("Python Quilt");
    Project webFunQuilt = new Project("Web Fundamentals Quilt");
    String pitch = javaQuilt.elevatorPitch(); //invokes elevatorPitch() method of Project.java
    System.out.println(CYAN_BOLD_BRIGHT + "\nConstructor 2 -- Should print the name of the project only." + RESET);
    System.out.println(javaQuilt.getName()); //prints only the name of the project.  Constructor 2
    System.out.println(pythonQuilt.getName());
    System.out.println(webFunQuilt.getName());

    Project javaCupQuilt = new Project("Java Cup Quilt", "Create a quilt with java cup panel in the center and 1 inch, 3 inch, and 5 inch borders.");
    Project pythonSnakeQuilt = new Project("Monty Python Quilt", "Create a quilt with Monty Python panel in the center with borders and binding.");
    Project WebFunWorldQuilt = new Project("Web World Quilt", "Create a quilt with WWW Fundamentals panel in the center with borders.");

    System.out.println(CYAN_BOLD_BRIGHT + "\nConstructor 3 -- Should print the name of the project and the description." + RESET);
    System.out.println(javaCupQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for project 3
    System.out.println(pythonSnakeQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for project 3
    System.out.println(WebFunWorldQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for project 3

    Project javaConceptsQuilt = new Project("KS Java Concepts Quilt", "Create a king-sized quilt with java cup panel and the concepts in separate blocks disbursed throughout and a 5 inch outer borders.", 380.75);
    Project pythonConceptsQuilt = new Project("TS Python Concepts Quilt", "Create a twin-sized quilt with Monty Python panel and the concepts in separate blocks disbursed throughout with binding.", 120.27);
    Project webFunConceptsQuilt = new Project("QS Java Concepts Quilt", "Create a queen-sized quilt with Web Fundamentals panel and the concepts in separate blocks disbursed throughout and a 3 inch outer borders.", 250.27);

    System.out.println(CYAN_BOLD_BRIGHT + "\nOptional Challenge 1 -- Should print the name of the project, initial cost in parenthesis, and the description." + RESET);
    System.out.println(javaConceptsQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for project 3
    System.out.println(pythonConceptsQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for project 3
    System.out.println(webFunConceptsQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for project 3


}
}

// NOTE:
//This file is the Executable (Worker Bee)