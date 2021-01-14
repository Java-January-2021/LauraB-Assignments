public class FizzBuzz{

    public void FizzBuzzTester(){
        for(int i = 1; i <= 50; i++){
            String output = fizzBuzz(i);
            System.out.println("Number: " + i + "\t--> " + "\tOutput: " + output);
        }
    }

    //Testing how to incorporate color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";


    public String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return ANSI_GREEN + "FIZZBUZZ (divisible by 3 and 5)" + ANSI_RESET;
        }
        else if(number % 3 == 0){
            return ANSI_YELLOW + "FIZZ (divisible by 3)" + ANSI_RESET;
        }

        else if(number % 5 == 0){
            return ANSI_CYAN + "BUZZ (divisible by 5)" + ANSI_RESET;
        }

        else {
            return ANSI_RED + Integer.toString(number) + ANSI_RESET;
        }
    }
}

/*FizzBuzz
Write a program that will take an integer and print Fizz if the number is divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, and the number itself for all other cases.

Objectives:
- Practice conditionals.

- Implement a classic interview algorithm.

Tasks:
- Create a FizzBuzz class that implements the following logic:

public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
    }
}
Output for 3:

Fizz
Output for 5:

Buzz
Output for 15:

FizzBuzz
Output for 2:

2*/

/*ANSI RESOURCE:
https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println */