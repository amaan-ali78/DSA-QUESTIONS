import java.util.Arrays;
import java.util.Scanner;

public class MoveNegative 
{
    static void negSort(int arr[])
    {
       Arrays.sort(arr);
    }
public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element in your Array : ");
        for (int i = 0;i < arr.length;i++) 
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array after sorting : ");
        negSort(arr);
        for (int i = 0; i < arr.length; i++) 
        {
         System.out.print(arr[i]+" ");   
        }  
}    
}
