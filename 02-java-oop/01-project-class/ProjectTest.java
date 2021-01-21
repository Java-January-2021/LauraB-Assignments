public class ProjectTest{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    
    public static void main(String[] args){

    // Create a ProjectTest file that will test all the functionality
    Project emptyProject = new Project();
    Project javaQuilt = new Project("KS Java Concepts", "118 x 113 sized quilt with java cup panel and the concepts in separate blocks disbursed throughout with 1 inch, 3 inch, and 5 inch outer borders.", 420.75);
    Project pythonQuilt = new Project("TS Python Concepts", "80 x 108 inch quilt with Monty Python panel and the concepts in separate blocks disbursed throughout with binding.", 120);
    Project webFunQuilt = new Project("QS Java Concepts", "102 x 113 inch quilt with Web Fundamentals panel and the concepts in separate blocks disbursed throughout and a 3 inch outer borders.", 250);

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 1  -- Empty Project, should print 'null.'" + RESET);
    System.out.println(RED_BOLD_BRIGHT + emptyProject.getName() + RESET); //should print null for an empty project

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 2 -- Should print the name of the project only." + RESET);
    System.out.println(javaQuilt.getName()); //prints only the name of the javaQuilt project.  Constructor 2
    System.out.println(pythonQuilt.getName()); //prints only the name of the pythonQuilt project.
    System.out.println(webFunQuilt.getName()); //prints only the name of the webFunQuilt project.

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 3 -- Should print the name of the project and the description." + RESET);
    System.out.println(javaQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for javaCupQuilt
    System.out.println(pythonQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for montyPythonQuilt
    System.out.println(webFunQuilt.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for WebFunWorldQuilt

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Optional Challenge 1 -- Should print the name of the project, initial cost in parenthesis, and the description." + RESET);
    System.out.println(javaQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for javaConceptsQuilt
    System.out.println(pythonQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for pythonConceptsQuilt
    System.out.println(webFunQuilt.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for webFunConceptsQuilt
    }
}

// NOTE:
//This file is the Executable (Worker Bee)