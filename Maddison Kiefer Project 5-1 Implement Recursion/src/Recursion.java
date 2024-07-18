// @author Maddison Kiefer

import java.util.Scanner;

public class Recursion {
    
    // Recursive method to calculate the product of an array of numbers
    public static int product(int [] nums, int index) {
        // If the index is less than 0, return 1
        if (index < 0) {
            return 1;
        }
        // Using recursion, calculate the product of the current number and the product of the rest of the numbers
        return nums[index] * product(nums, index - 1);
    }
    
    public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);

        // Create an array to store the five numbers
        int[] nums = new int[5];

        // Asks the user to enter five numbers
        System.out.println("Please enter five numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            nums[i] = scnr.nextInt();
        }

        // Calls product() to calculate the product using recursion
        int product = product(nums, 4);

        // Display the result
        System.out.println("The product of the five numbers is: " + product);
    }
}
