import java.util.Scanner;

public class Intersection {
    static void Inter(int arr1[],int arr2[],int n,int m)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter size of your First array : ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter size of your Second array : ");
        m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter element in your first Array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter element in your Second Array : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Inter(arr1, arr2, n, m);
    }
}
