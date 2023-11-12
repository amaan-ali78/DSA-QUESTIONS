import java.util.Scanner;

public class Rotate {
    static void rotateArray(int[] arr, int n) {
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element in your Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArray(arr, n);
        System.out.print("Element after Rotating the Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}