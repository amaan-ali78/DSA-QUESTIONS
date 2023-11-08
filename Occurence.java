import java.util.*;

class Occurence {
    static int occur(int arr[], int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.println("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in your Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to find the occurence : ");
        x = sc.nextInt();
        System.out.println("occurence : "+occur(arr, n, x));
    }
}