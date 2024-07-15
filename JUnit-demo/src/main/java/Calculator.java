import java.util.Arrays;

public class Calculator {
    public double divide(int num1,int num2){
        if(num1==0) return 0;
        if(num2==0) return Integer.MAX_VALUE;
        return num1/num2;
    }

    public int[] doubleArray(int[] arr) {
        int n=arr.length;
        int[] doubled=new int[n];
        for(int i=0;i<n;i++) doubled[i]=arr[i]*2;
        return doubled;
    }

    public int[] sortArray(int[] arr){
        for(int i=0;i<1000000;i++) Arrays.sort(arr);
        return arr;
    }
}
