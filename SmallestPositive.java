public class SmallestPositive {
    static int findSmall(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0)
                arr[i] = arr.length + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);
            if (index < arr.length)
               if( arr[index - 1] > 0)
                arr[index - 1] *= -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0)
                return i + 1;
        }

        return arr.length + 1;
    }

    public static void main(String[] args) {
        
    int arr[] = {1, 1, 0, -1, -2};
    System.out.println(findSmall(arr));
    }
}
