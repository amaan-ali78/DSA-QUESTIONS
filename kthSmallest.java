import java.util.Arrays;
import java.util.Scanner;

public class kthSmallest {
    static int small(int[]arr,int n,int k)
    {
        //Sorting the array to find the kth smllest element
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in your Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Value of K :");
        k=sc.nextInt();
        System.out.println("The kth smallest element is  : "+small(arr, n, k));
    }
}
