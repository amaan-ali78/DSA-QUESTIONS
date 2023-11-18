public class MaximumProductSubArray {
    static void subProduct(int arr[]) {
        int suf = Integer.MIN_VALUE;
        int pre = Integer.MIN_VALUE;
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (suf == 0)
                suf = 1;
            if(pre==0)
            pre=1;
            suf*=arr[i];
            pre*=arr[arr.length-i-1];
            maxi=Math.max(maxi, Math.max(pre, suf));
        }
        System.out.println("The Maximum product is : "+maxi);
    }

    public static void main(String[] args) {
        int arr[] = {-1, -3, -10, 0, 60};
        subProduct(arr);
    }
}
