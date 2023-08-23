//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       
        Map<Integer,Integer> mp = new HashMap<>();
        int presum = 0;
        int maxl = 0;
        mp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {

            presum +=arr[i];
            if(mp.containsKey(presum)){
                maxl = Math.max(maxl, i-mp.get(presum));

            }
            else{
                mp.put(presum,i);
            }
            
        }
        return maxl; 
    }
}