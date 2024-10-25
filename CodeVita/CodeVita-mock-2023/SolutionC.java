// problem name : 3Palindrom

import java.util.*;

class SolutionC{
    private static boolean isPalin(int start,int end,char[] arr){
        boolean flag=true;
        while(start<=end){
            if(arr[start]!=arr[end]){
                flag=false;
                break;
            }
            start++;
            end--;
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] charArr=str.toCharArray();
        // System.out.println(Arrays.toString(charArr));
        int n=charArr.length;
        if(n<=2){
            System.out.println("Impossible");
            return;
        }
        if(n==3){
            for(char ch:charArr) System.out.println(ch);
            return;
        }
        boolean found=false;
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<=n-3;i++){
            sb1.append(charArr[i]);
            if(isPalin(0,i,charArr)){
                StringBuilder sb2=new StringBuilder();
                for(int j=i+1;j<=n-2;j++){
                    sb2.append(charArr[j]);
                    if(isPalin(i+1,j,charArr)){
                        StringBuilder sb3=new StringBuilder();
                        for(int k=j+1;k<=n-1;k++){
                            sb3.append(charArr[k]);
                        }
                        if(isPalin(j+1,n-1,charArr)){
                            System.out.println(sb1.toString());
                            System.out.println(sb2.toString());
                            System.out.println(sb3.toString());
                            found=true;
                        }
                        if(found) break;
                    }
                    if(found) break;
                }
            }
            if(found) break;        
    }
    if(!found) System.out.println("Impossible");

    }
}