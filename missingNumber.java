import java.util.*;
public class missingNumber {
    public static int missingNumber(int arr[]){
        int n=arr.length;
        int totalSum=(n+1)*(n+2)/2;
        int actualSum=0;
        for(int i=0;i<n;i++){
            actualSum+=arr[i];
        }
        return totalSum-actualSum;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,6};
        
        System.out.println("The missing number is: "+missingNumber(arr));
    }
}
