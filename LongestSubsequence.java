import java.util.HashSet;
import java.util.Set;

public class LongestSubsequence {
    static void subCount(int arr[]) {
      int previous,x,count,longest=Integer.MIN_VALUE;  
      Set<Integer> s1 = new HashSet<Integer>();
      for (int i = 0; i < arr.length; i++) {
        s1.add(arr[i]);
      }
     for(int it : s1)
     {    
     x=it;
     count=0;
     while(s1.contains(x-1))
     {
        count+=1;
        x=x+1;
     }
     longest=Math.max(count, longest);
     }
     System.out.println(longest);
    }

    public static void main(String[] args) {
        int arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
        subCount(arr);
    }
}
