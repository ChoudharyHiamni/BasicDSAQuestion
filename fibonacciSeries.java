import java.util.*;
public class fibonacciSeries {
    
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a num:");
         int num=sc.nextInt();
         int a=0,b=1,c;
         for(int i=0;i<num;i++){
            System.out.println(a+"");
            c=a+b;
            a=b;
            b=c;
         }
    }
}
