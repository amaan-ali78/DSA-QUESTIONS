import java.util.Scanner;

public class SubarraySum 
{
    static void findIndex(int arr[],int sum)
    {
        int compare=0;
        for(int i=0;i<arr.length -1;i++)
        {
            compare+=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
             compare=compare + arr[j];
             if(compare==sum)
             {
                System.out.println("the start index is "+i+" and last index is "+j);
             }
            }
            compare=0;
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,sum;
        System.out.print("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element in your Array : ");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of sum :");
        sum=sc.nextInt();
        findIndex(arr, sum);
    }
}
