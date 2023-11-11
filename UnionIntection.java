import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UnionIntection {
    static ArrayList<Integer> union(int arr1[], int arr2[], int n, int m) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i : arr1) {
            set.add(i);
        }
        for (int i : arr2) {
            set.add(i);
        }
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.addAll(set);
        return List;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter size of your First array : ");
        n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter size of your Second array : ");
        m = sc.nextInt();
        int arr2[] = new int[n];
        System.out.println("Enter element in your first Array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter element in your Second Array : ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        ArrayList<Integer> list;
        list = union(arr1, arr2, n, m);
        System.out.println("Arrays after intrection are : ");
        System.out.println(list);
    }
}
