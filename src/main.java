import java.util.*;

    public class main {

        public static void main(String[] args) {
            //Global variables
            final int price = 40;
            final int capacity = 10000;

            //READ THE NUMBER OF ITEMS & THEIR WEIGHT
            System.out.println("How many items?");
            Scanner in = new Scanner(System.in);
            int item = Integer.parseInt(in.nextLine()); //Open the commandline and read from the keyboard
            System.out.println(item);
            double[] weights = new double[item];
            for (int i = 0; i < item; i++) {
                System.out.println("Write the weight of the " + i+1 + "st element");
                weights[i] = in.nextDouble();
            }
            System.out.println(weights.toString());

            //From this poi we got everything we need


            //Candidates : weights

            //Sorting : sort by increasing method all the candidates
            double min = getMinValue(weights);
            double max = getMaxValue(weights);
            System.out.println("My min value is " + min);
            System.out.println("My max value is " + max);
            quickSort(weights,min, max);

        }

        public static void swap(double[] array, int pos1, int pos2) {
            double temp = array[pos1];
            array[pos1] = array[pos2];
            array[pos2] = temp;
        }

        public static int partition(double[] array, int low, int high) {
            int pivot = low;

            for (int i = low + 1; i < high; ) {
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

        public static void testQuickSort(){
            double[] array = {0, -1, 2, -3, 5, 2, -1, -3};

            for (double v : array) {
                System.out.print(v + " ");
            }

            quickSort(array, 0, array.length - 1);
            System.out.println("");

            for (double v : array) {
                System.out.print(v + " ");
            }
        }


        public static void quickSort(double[] array, int low, int high) {
            int piv;
            if (low < high) {
                piv = partition(array, low, high);
                quickSort(array, low, piv);
                quickSort(array, piv + 1, high);
            }
        }

        public static double getMaxValue(double[] numbers){
            double maxValue = numbers[0];
            for(int i=1;i < numbers.length;i++){
                if(numbers[i] > maxValue){
                    maxValue = numbers[i];
                }
            }
            return maxValue;
        }
        public static double getMinValue(double[] numbers){
            double minValue = numbers[0];
            for(int i=1;i<numbers.length;i++){
                if(numbers[i] < minValue){
                    minValue = numbers[i];
                }
            }
            return minValue;
        }


    }


