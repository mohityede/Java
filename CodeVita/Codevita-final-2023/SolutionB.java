import java.util.*;

class SolutionB{
    private static long getAns(int[] arr){
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int maxi=0;
        for(int i=0;i<n;i++){
            left[i]=maxi;
            maxi=Math.max(maxi,arr[i]);
        }
        maxi=0;
        for(int i=n-1;i>=0;i--){
            right[i]=maxi;
            maxi=Math.max(maxi,arr[i]);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            int cap=Math.min(left[i],right[i]);
            if(arr[i]<cap) ans+=(cap-arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String inp= sc.nextLine();
        String[] inpArr=inp.split(" ");
        int n=inpArr.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(inpArr[i]);
        }
		
		System.out.println(getAns(arr));
    }
}