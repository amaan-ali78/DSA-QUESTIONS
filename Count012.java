import java.util.Scanner;

public class Count012 {
    static void sort(int arr[], int n) {
        int count0 = 0, count1 = 0, count2 = 0, index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }
        System.out.println(count0+" "+count1+" "
        +count2);
        for (int i = 0; i <=count0-1; i++) {
            arr[index] = 0;
            index++;
        }
        for (int i = 0; i <= count1-1; i++) {
            arr[index] = 1;
            index++;
        }
        for (int i = 0; i <= count2-1; i++) {
            arr[index] = 2;
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of your Array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element in your Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        System.out.print("Array after sorting is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
