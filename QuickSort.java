import java.util.Scanner;

public class QuickSort {

    // To print array
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = arr[high];
        arr[high]=arr[i];
        arr[i]=temp;
        return i;

    }

    static void sortQuick(int arr[], int low, int high) {
        if (low < high) {
            int ptn = partition(arr, low, high);
            sortQuick(arr, low, ptn - 1);
            sortQuick(arr, ptn + 1, high);
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
        sortQuick(arr, 0, (n-1));
        System.out.print("Array after sorting using quick sort : ");
        printArr(arr);
    }
}
