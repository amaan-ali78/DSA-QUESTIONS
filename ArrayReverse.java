import java.util.Scanner;

public class ArrayReverse 
{
    static void reverse(int[] arr, int n) 
    {
     int i=0,j=n-1,temp;
     while(i<=j)
     {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
     }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in your Array");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        reverse(arr, n);
        System.out.print("Element after Reversing the Array : ");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }
    }
}
