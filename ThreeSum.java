import java.util.Arrays;

public class ThreeSum {

    static boolean findTriplet(int arr[], int sum) {
        Arrays.sort(arr);
        int l, r;
        for (int i = 0; i < arr.length - 2; i++) {
            l = i + 1;
            r = arr.length - 1;
            while (l < r) {
                if (arr[i] + arr[l] + arr[r] == sum) {
                    System.out.println("The triplet is " + arr[i] + " " + arr[l] + " " + arr[r]);
                    return true;
                } else if (arr[i] + arr[l] + arr[r] > sum) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 3, 4, 1, 6, 9 }, sum = 24;
        System.out.println(findTriplet(arr, sum));
    }
}
