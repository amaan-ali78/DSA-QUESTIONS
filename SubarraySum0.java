public class SubarraySum0 
{
    static boolean sumCheck(int arr[])
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                return true;
            }
            for (int j = i+1; j < arr.length; j++) {
                 sum+=arr[j];
                 if(sum==0)
                 return true;
            }
        }
        return false;
    }
 public static void main(String[] args) 
 {
  int arr[]={4, 2, -3, 1, 6};
 System.out.println( sumCheck(arr));
 }   
}
