import java.util.*;

public class MInMax 
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter the size of your Array: ");
    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the element in your  Array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("The Smallest Element is "+arr[0]+" and Greatest Element is "+arr[n-1]);   
    }
}
