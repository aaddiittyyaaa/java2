public class q2 {
    public static void main(String[] args) {
        int arr[] = new int[] { 82, 89, 987, 675, 552 };
        int smallest = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest element in array: " + smallest);
    }
}