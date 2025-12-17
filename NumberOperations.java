import java.util.Scanner;
// Imports the Scanner class to allow user input from the keyboard

public class NumberOperations {
    public static void main(String[] args) {
        // Main method where the program starts execution

        Scanner scan = new Scanner(System.in);
        // Creates a Scanner object to read user input

        int i = 0;
        // Control variable used to keep the program running in the loop

        System.out.println("Welcome! ");
        System.out.print("Please input a number: ");
        float number = scan.nextFloat();
        // Stores the number entered by the user

        System.out.println("What would you like to do to this number: ");
        if (number == 0) {
            // If the number is zero, do not show the reciprocal option
            System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
        } else {
            // If the number is not zero, include the reciprocal option
            System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
        }

        // Loop continues until the program is manually exited
        while(i == 0) {

            int response = scan.nextInt();
            // Stores the user's menu selection

            switch (response) {
                case -1:
                    System.out.print("Please input a number: ");
                    number = scan.nextFloat();
                    // Allows the user to re-enter a new number

                    // Displays menu again based on the new number
                    if(number==0) {
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }else{
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }
                    break;
                case 0:
                    // Calculates the additive inverse of the number
                    float inverse = number*-1;
                    System.out.println("The additive inverse of "+number+" is "+inverse);
                    System.out.println("What would you like to do to this number: ");
                    if(number==0) {
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }else{
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }
                    break;

                case 1:
                    // Calculates and displays the reciprocal of the number
                    System.out.println("What would you like to do to this number: ");
                    float reciprocal = 1/number;
                    System.out.println("The reciprocal of "+number+" is "+reciprocal);
                    if(number==0) {
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }else{
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }
                    break;

                case 2:
                    // Calculates and displays the square of the number
                    float square = number*number;
                    System.out.println("The square of "+number+ " is "+square);
                    if(number==0) {
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }else{
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }
                    break;

                case 3:
                    // Calculates and displays the cube of the number
                    float cube = number*number*number;
                    System.out.println("The cube of "+number+ " is " +cube);
                    if(number==0) {
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }else{
                        System.out.println("What would you like to do to this number: ");
                        System.out.println("-1- Re-enter the number\n0- Get the additive inverse of the number\n1- Get the reciprocal of the number\n2- Square the number\n3- Cube the number\n4- Exit the program");
                    }
                    break;

                case 4:
                    // Displays exit message (program still loops due to while condition)
                    System.out.println("Thank you, goodbye!");
                    i=1;
                    break;
                default:
                    System.out.println("Please enter a valid number between -1 and 4:");
                    break;
            }
        }
    }
}
