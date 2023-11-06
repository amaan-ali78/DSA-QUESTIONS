import java.util.Scanner;

public class PeakElement {
  static int findPeak(int[] arr, int n) {
    if (n == 1)
     return 0;
     if (arr[0]>arr[1]) {
      return 0;
     }
    if (arr[n-1]>arr[n-2]) {
      return n-1;
    }
    for (int i = 1; i < n-1; i++) {
      if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
        return i;
    }
    return 0;
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
    System.out.println(arr[findPeak(arr, n)]);
  }
}