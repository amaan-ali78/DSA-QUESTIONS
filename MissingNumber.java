import java.util.Scanner;

public class MissingNumber {
    static void missNum(int arr[], int n) {
        int temp[] = new int[n+1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        for (int i = 0; i < n; i++) {
        temp[arr[i]-1]=1;
        }
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==0)
            System.out.println("Missing number is : "+(i+1));
        }
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
        missNum(arr, n);
    }
}
