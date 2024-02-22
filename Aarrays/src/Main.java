public class Main {

    public static void main(String[] args) {
        // Test array
      // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,22};
       // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17};

        // Manipulate the array according to the specified rules
        manipulateArray(arr);

        // Print the manipulated array
        System.out.println("Manipulated Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Method to manipulate the array according to the specified rules
    public static void manipulateArray(int[] arr) {
        int n = arr.length+1;
        int leftSize, rightSize;

        // Determine the sizes of the left and right halves based on the array length
        if (n % 2 == 0) {
            // If the array length is even
            if (n % 4 != 0) {
                // If the array length is divisible by 4 plus 2
                // Consider both halves to have equal size
                leftSize =( n / 2) ;
                rightSize = (n / 2)+1;


            } else {
                // If the array length is divisible by 4
                // Consider the left half to be bigger by one element than the right half
                leftSize = (n / 2)-1;
                rightSize = (n / 2) ;
            }
        } else {
            // If the array length is odd
            if ((n-1 ) % 4 == 0) {
                // If the array length minus one is divisible by 4
                // Left side is equal to the size of the right side and the middle number will remain the same
                leftSize = (((n-1) / 2)-1);
                rightSize = ((n-1) / 2)+1;
            } else {
                // If the array length minus one is not divisible by 4
                // Left side is bigger than the right side by one element
                leftSize = ((n-1) / 2);
                rightSize = ((n-1) / 2)+2;
            }
        }

        // Reverse every two consecutive elements of the left half of the array
        for (int i = 0; i <= leftSize ; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Change the second element of every two consecutive elements of the right half to their sum
        for (int i = rightSize; i < n - 1; i += 2) {
            arr[i + 1] = arr[i] + arr[i + 1];
        }
    }
}
