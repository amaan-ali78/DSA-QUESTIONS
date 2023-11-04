import java.util.Scanner;

public class PeakElement {
  static int findPeak(int[] arr, int n) {
    if (n == 1)
      return arr[0];
    for (int i = 1; i < n-1; i++) {
      if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
        return arr[i];
    }
    return -1;
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
    System.out.println(findPeak(arr, n));
  }
}