// VIP Cafe

import java.util.Arrays;
import java.util.Scanner;

/**
 * SolutionB
 */
public class SolutionB {

    public static void main(String[] args) {
        // System.out.println("solutionB");

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        // System.out.println(Arrays.toString(arr));
        int res=getres(n,arr,k);
        System.out.println(res);
    }

    private static int getres(int n,int[] arr,int k){
        for(int curr=0;curr<n;curr++){
            int highInd=0;
            for(int i=0;i<n;i++){
                if(arr[i]>arr[highInd]){
                    highInd=i;
                }
            }
            if(highInd==k-1) return curr+1;
            arr[highInd]=0;
            for(int i=0;i<highInd;i++){
                if(arr[i]!=0) arr[i]++;
            }
        }
        return -1;
    }
}