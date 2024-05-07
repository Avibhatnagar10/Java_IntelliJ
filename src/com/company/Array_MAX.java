import java.util.Arrays;
 public class Array_MAX {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 7, 11, 2, 15}; // Sample array, you can replace it with your own array

        int[] largestNumbers = findThreeLargestNumbers(array);

        System.out.println("The three largest numbers in the array are: " + Arrays.toString(largestNumbers));
    }

    public static int[] findThreeLargestNumbers(int[] array) {
        int[] largestNumbers = new int[3];
        Arrays.fill(largestNumbers, Integer.MIN_VALUE);

        for (int num : array) {
            updateLargest(largestNumbers, num);
        }

        return largestNumbers;
    }

    public static void updateLargest(int[] largestNumbers, int num) {
        if (num > largestNumbers[2]) {
            shiftAndUpdate(largestNumbers, num, 2);
        } else if (num > largestNumbers[1]) {
            shiftAndUpdate(largestNumbers, num, 1);
        } else if (num > largestNumbers[0]) {
            shiftAndUpdate(largestNumbers, num, 0);
        }
    }

    public static void shiftAndUpdate(int[] array, int num, int index) {
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                array[i] = num;
            } else {
                array[i] = array[i + 1];
            }
        }
    }
}
