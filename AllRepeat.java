import java.util.Scanner;

public class AllRepeat {
    static void findRepeat(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j])
                System.out.print(arr[i]+" ");
            }
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
        System.out.println("Element that are repeated are : ");
        findRepeat(arr);
    }
}
