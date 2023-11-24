public class MinimumJumps {
    static int countMinJump(int arr[],int n)
    {
        int max=0,maxRange=0,jump=0;

        for (int i = 0; i < arr.length; i++) {
           max=Math.max(max, i+arr[i]);
           if(maxRange ==  i)
           {
            maxRange=max;
            jump++;
            if(maxRange>=n-1)
            return jump;
           } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(countMinJump(arr, arr.length));
    }
}
