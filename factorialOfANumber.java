import java.util.*;
public class factorialOfANumber {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=num;i++){
            factorial=factorial*i;

        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    }
}
