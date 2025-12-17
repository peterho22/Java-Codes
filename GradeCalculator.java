import java.util.Scanner;
// Imports the scanner class so we can read user input from the keyboard

public class GradeCalculator {
    public static void main(String[] args) {
        // Main method where the program starts running

        Scanner scan = new Scanner(System.in);
        // Creates a Scanner object to read input from the user

        System.out.print("Enter your average lab grade: ");
        // Prompts the user to enter their lab average
        float average_lab_grade = scan.nextFloat();
        // Stores the lab average entered by the user

        System.out.print("Enter your average assignment grade: ");
        // Prompts the user to enter their assignment average
        float average_assignment_grade = scan.nextFloat();
        // Stores the assignment average entered by the user

        System.out.print("Enter your midterm exam grade: ");
        // Prompts the user to enter their midterm exam grade
        float midterm_grade = scan.nextFloat();
        // Stores the midterm exam grade

        System.out.print("Enter your final exam grade: ");
        // Prompts the user to enter their final exam grade
        float final_exam_grade = scan.nextFloat();
        // Stores the final exam grade

        // Calculates the weighted lab grade (10%)
        float weighted_lab_average = (float) (average_lab_grade * 0.10);
        System.out.println("Your weighted lab average is "+weighted_lab_average);

        // Calculates the weighted assignment grade (40%)
        float weighted_assignment_average = (float) (average_assignment_grade * 0.40);
        System.out.println("Your weighted assignment average is "+weighted_assignment_average);

        // Calculates the weighted midterm exam grade (20%)
        float weighted_midterm_average = (float) (midterm_grade * 0.20);
        System.out.println("Your weighted midterm exam average is "+weighted_midterm_average);

        // Calculates the weighted final exam grade (30%)
        float weighted_final_average = (float) (final_exam_grade * 0.30);
        System.out.println("Your weighted final exam average is "+weighted_final_average);

        // Adds all weighted grades together to get the final grade
        System.out.println("Adding numbers...");
        float final_grade = weighted_lab_average +weighted_assignment_average+weighted_midterm_average+weighted_final_average;

        System.out.print("Your final grade in this class is "+final_grade);

    }

}
