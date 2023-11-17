class ArrangeAlternate {
    static void alter(int arr[], int n) {
        int index = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) && (i % 2 == 0)) {
                index += 2;
                continue;
            }
            for (int j = 0; j < n / 2 - 1; j++) {
                if (arr[index] < 0) {
                    if(index==n-1)
                    {
                       index=n-1;
                    }else{
                        index += 2;
                    }
                    
                } else {
                    break;
                }
            }
            if (arr[i] < 0) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index += 2;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, -4, 7, 8, 9 };
        alter(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
