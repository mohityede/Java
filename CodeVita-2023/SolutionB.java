// same as
// https://leetcode.com/problems/candy/description/

import java.util.*;
import java.util.Arrays;

class SolutionB{
    // private static int getAns(int n,int[] arr){
    //     int[][] dp= new int[n][2];
    //     for(int i=0;i<n;i++){
    //         dp[i][0]=arr[i];
    //         dp[i][1]=i;
    //     }
    //     Arrays.sort(dp,(a,b)-> a[0]-b[0]);
    //     // System.out.println(Arrays.deepToString(dp));
    //     int[] gifts= new int[n];
    //     Arrays.fill(gifts,1);
    //     for(int[] curr:dp){
    //         if(curr[1]-1>=0 && arr[curr[1]-1]<curr[0])
    //             gifts[curr[1]]=gifts[curr[1]-1]+1;            
    //         if(curr[1]+1<n && arr[curr[1]+1]<curr[0])
    //             gifts[curr[1]]=Math.max(gifts[curr[1]],gifts[curr[1]+1]+1);            
    //     }
        
    //     int ans=0;
    //     for(int curr:gifts) ans+=curr;
    //     return ans;
    // }
    private static int getAns2(int n,int[] arr){
        if(n==1) return 1;
        int[] gifts= new int[n];
        Arrays.fill(gifts,1);
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]) gifts[i]=gifts[i-1]+1;       
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1] && gifts[i]<=gifts[i+1]) gifts[i]=gifts[i+1]+1;       
        }
        int ans=0;
        for(int curr:gifts) ans+=curr;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans= getAns2(n,arr);
            System.out.println(ans);
            t--;
        }
    }
}