package Practice1;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != (array.length - 1)) {
                System.out.printf("%.0f ", array[i]);
            } else {
                System.out.printf("%.0f", array[i]);
            }
        }
        System.out.print("\n");
    }


    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        // Input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] objects = new double[n];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = scanner.nextDouble();
        }

        System.out.println("Given: ");
        printArray(objects);

        int limit = 10000; // This is the capacity of the truck
        List<Double> loaded = new ArrayList<Double>(); // To keep the values of the loaded objects
        int currentLoad = 0; // To have the total of the loaded items

        // GENIUS AT WORK...
        // [CODE IN PROGRESS...]
        // RECOMMENDED STRUCTURE OF YOUR ALGORITHM:

        //TODO: 1. Define your candidates (You can just add in a comment saying, "my candidates are...")
        //Candidates are the objects

        //TODO: 2. Define a sorting method for your candidates (if necessary)
        quickSort(objects, 0, objects.length - 1); //Sort the candidates from smallest to largest

        //Check that quickSort works
        //System.out.println("Sorted: ");
        //printArray(objects);

        //TODO: 3. Go over each one of your candidates ONCE, and use a FEASIBILITY_METHOD to check if by adding the candidate to the solution, the solution is still feasible or not.
        for (int i = 0; i < objects.length; i++) {
            if ((currentLoad + objects[i]) < limit) {
                loaded.add(objects[i]);
                currentLoad += objects[i];
            } else {
                break;
            }
        }

        //TODO: 4. Selection?
        //Not needed

        //TODO: 5. Define an end condition.
        //1. When the objects are all loaded without exceeding the limit
        //2, When adding an other object it will exceed the limit (said object is not loaded)

        // PRINT YOUR SOLUTION:
        // ON THE FIRST LINE, PRINT YOUR ARRAY WITH 'printArray(array)'. YOUR ARRAY NEEDS TO BE SORTED FROM SMALLEST TO LARGEST.
        //TODO: Check if you can NOT use printArray(). If yes ->
        System.out.println(loaded);
        // ON THE SECOND LINE, PRINT THE SCORE OF YOUR SOLUTION.
        System.out.println("Score: " + currentLoad);

    }

    public static void swap(double[] array, int pos1, int pos2) {
        double temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static int partition(double[] array, int low, int high) {
        int pivot = low;

        for (int i = low + 1; i <= high; ) {
            if (array[pivot] < array[i]) {
                swap(array, i, high);
                high--;
            } else {
                swap(array, pivot, i);
                pivot = i;
                i++;
            }
        }

        return pivot;

    }

    public static void quickSort(double[] array, int low, int high) {
        int piv;
        if (low < high) {
            piv = partition(array, low, high);
            quickSort(array, low, piv - 1);
            quickSort(array, piv + 1, high);
        }
    }

}
