import java.util.*;

class SolutionF{
    private static long getAns(int[] arr,int m){
        int n=arr.length;
        if(arr[n-1]==-1) return -1;
        long[] dp=new long[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        dp[1]=arr[1];
        for(int i=2;i<n;i++){
            if(arr[i]==-1) continue;
            for(int j=0;j<=m+1;j++){
                if(i-j>=0 && arr[i-j]!=-1 && dp[i-j]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],arr[i]+dp[i-j]);
                }
            }
        }
        if(dp[n-1]==Integer.MAX_VALUE) return -1;
        return dp[n-1]+arr[0];
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        System.out.print(getAns(arr,m));
    }
}