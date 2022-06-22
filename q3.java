public class q3 {
    public static void main(String[] args) {
        int arr[] = new int[] { 68, 88, 199, 101, 99 };
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all elements of the array are: " + sum);
    }
}