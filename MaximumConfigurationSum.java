public class MaximumConfigurationSum {
    static void maxConfigSum(int arr[], int n) {
        int sum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum += (arr[(j + i) % n] * j);
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Max Sum in this Configuration is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 2 };
        maxConfigSum(arr, arr.length);
    }
}
