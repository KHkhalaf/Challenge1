// Java Program to find the array index of the two numbers whose sum equals the expected sum.
// by Default Sorts in an Ascending Order
// using Arrays.sort() Method

// Importing Arrays class from the utility class
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Main class
public class Main {
    // Main driver method
    public static void main(String[] arg){
        int n, expectedSum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n = sc.nextInt();
        //creates an array in the memory of length n
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
            array[i] = sc.nextInt();
        System.out.println("Enter the expected sum: ");

        expectedSum = sc.nextInt();
        System.out.println(Arrays.toString(expectedSum(array, expectedSum)));
    }
    public static int[] expectedSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
