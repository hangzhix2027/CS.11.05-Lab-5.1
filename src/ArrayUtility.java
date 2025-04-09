public class ArrayUtility {

    public static void print(int[] array) {
        if (array.length == 0) {
            System.out.println("");
            return;
        }
        String output = "";
        for (int i = 0; i < array.length - 1; i++) {
            output = output + array[i] + ", ";
            output = output + array[array.length - 1];
            System.out.println(output);
        }
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        return total;
    }

    public static double average(int[] array) {
        if (array.length == 0) {
            return 0.0;  // Return 0 or throw an exception based on requirements
        }
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }
        double avg = (double) total / array.length;
        avg = (int)(avg * 100.0) / 100.0;
        return avg;
    }



    public static int minimum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
            return min;
    }

    public static int maximum(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int maxi = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxi) {
                maxi = array[i];
            }
        }
        return maxi;
    }

    public static int evenCount(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseOne(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void reverseTwo(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
    }

    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
                    return false;
            }


    public static boolean linearSearchString(String[] array, String str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(str)) {
                return true;
            }
        }
        return false;
    }


    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
   String result = "" +array[0];
        for(int i=1; i<array.length; i++){
result = result +  ", "+ array [i];
   }
        return result;
    }

    public static boolean twoSum(int[] array, int num) {
            // Check all possible pairs of elements
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    // Check if the current pair adds up to the target
                    if (array[i] + array[j] == num) {
                        return true;
                    }
                }
            }

            // No pair found that sums to the target
            return false;
        }

    public static void shiftRight(int[] array) {
        // Handle empty or single-element array
        if (array.length <= 1) {
            return;
        }

        // Store the last element
        int lastElement = array[array.length - 1];

        // Shift elements to the right
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        // Place the last element at the beginning
        array[0] = lastElement;
    }

    public static void shiftLeft(int[] array) {
        // Handle empty or single-element array
        if (array.length <= 1) {
            return;
        }

        // Store the first element
        int firstElement = array[0];

        // Shift elements to the left
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        // Place the first element at the end
        array[array.length - 1] = firstElement;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftRight(array);
        }
    }


    public static void shiftLeftNTimes(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }


}
