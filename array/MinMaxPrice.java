import java.util.*;

class Solution {
    public void minMaxPrice(int prices[]) {
        int  dif = prices[1]-prices[0],currDiff = 0,n=prices.length;
        for(int i=2;i<n;i++){
                currDiff = prices[i]-prices[i-1];
                if(currDiff<dif)
                    dif = currDiff;
        }
        System.out.print(dif+" ");
        System.out.print(prices[n-1]-prices[0]);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        Solution Obj = new Solution();
        Obj.minMaxPrice(arr);
        sc.close();
    }
}
