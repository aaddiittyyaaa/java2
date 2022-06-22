public class q1 {
    public static void main(String[] args) {
        int arr[] = new int[] { 59, 102, 101, 88, 87 };
        int sum = 0;
        double avg;
        for (int i = 0; i < arr.length; i++) {
            sum = (sum + arr[i]);
        }
        avg = sum / arr.length;
        System.out.println("The average of the given array is:" + avg);
    }
}