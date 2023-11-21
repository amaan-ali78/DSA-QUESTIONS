public class MinimumPlatform 
{
    static void countPlatform(int arr1[], int arr2[], int n) 
    {
        int count = 0;
        for (int i = 0; i < n - 1; i++) 
        {
            if (arr1[i] + (arr2[i] - arr1[i]) >= arr1[i + 1])
                count++;
        }
        if (count == 0) 
        {
            count = 1;
        }
        System.out.println("No of  platform required is : " + count);
    }

    public static void main(String[] args) 
    {
        int arr1[] = { 900, 940, 950, 1100, 1500, 1800 };
        int arr2[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        countPlatform(arr1, arr2, arr1.length);
        countPlatform(arr1, arr2, 2); 
    }
}
