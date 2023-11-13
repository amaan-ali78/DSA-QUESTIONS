import java.util.Scanner;

public class RepeatingElement {
    static void repeat(int arr[], int n) {
    int temp[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        temp[arr[i]-1]+=1;
    }
    System.out.print("Element that are repeated are : ");
    for (int i = 0; i < temp.length; i++) {
        if(temp[i]>1)
        System.out.print((i+1)+" ");
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
        repeat(arr, n);
    }
}
