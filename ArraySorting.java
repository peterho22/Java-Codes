// ArraySortingDemo.java
// Demonstrates generating a random array, checking if it is sorted,
// and sorting the array using the selection sort algorithm.

import java.util.Random;
import java.util.Scanner;

public class ArraySorting {
    // Fills the array with random integers between -500 and 499
    public static void create_random_array(int[] array, int array_size) {
        Random rand = new Random();
        for (int i = 0; i < array_size; i++) {
            array[i] = rand.nextInt(1000) - 500;
        }
    }

    // Checks whether the array is sorted in ascending order
    public static boolean is_array_sorted(int[] array, int array_size)
    {
        for (int i = 0; i < array_size - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Sorts the array in ascending order using selection sort
    public static void sort_array(int array[], int array_size){
        int min_index;
        for (int i = 0; i < array_size - 1; i++) {
            min_index= i;
            for (int j = i + 1; j < array_size; j++){
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    // Provides a menu-driven interface for interacting with the array
    public static void main(String[] args) {
        int n = 10;
        int array[] = new int[n];
        Scanner sc = new Scanner(System.in);
        create_random_array(array, n);
        System.out.print("Random Array: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[n - 1]);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1) Generate a new random array");
            System.out.println("2) Is the array sorted?");
            System.out.println("3) Sort the array");
            System.out.println("4) Quit");
            System.out.print("\nChoice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                create_random_array(array, n);
                System.out.print("\nRandom Array: ");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(array[i] + ", ");
                }
                System.out.println(array[n - 1]);
            } else if (choice == 2) {
                if (is_array_sorted(array, n)) {
                    System.out.print("\nThe array is sorted.");
                } else {
                    System.out.println("\nThe array is not sorted.");
                }
            } else if (choice == 3) {
                sort_array(array, n);
                System.out.print("\nSorted Array: ");
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(array[i] + ", ");
                } System.out.println(array[n - 1]);
            }else if (choice != 4) {
                System.out.println("\nTry again...");
            }
        }
        sc.close();
    }
}