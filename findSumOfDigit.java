import java.util.*;
public class findSumOfDigit {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int lastDigit=num%10;  //get last digit
            sum=sum+lastDigit;
            num=num/10;  //remove last digit
        }
        System.out.println("Sum of digits is: "+sum);
    }
}
