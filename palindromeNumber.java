import java.util.*;
public class palindromeNumber {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();

        int original=num;
        int reversed=0;
        while(num>0){
            int lastDigit=num%10;   //get last digit
            reversed=reversed*10+lastDigit; //append last digit to reversed
            num=num/10;  //remove last digit
        }
        if(original==reversed){
            System.out.println(original+" is a palindrome number.");
        }else{
            System.out.println(original+" is not a palindrome number.");
        }
    }
}
