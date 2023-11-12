import java.util.Scanner;

public class CountPair {
    static void count(int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k)
                    count++;
            }
        }
        System.out.println("The numbers of pair is "+count);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, k;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element in your Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of your Sum : ");
        k = sc.nextInt();
        count(arr, n, k);
    }
}
