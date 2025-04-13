
public class reverseAString{

    public static void main(String args[]){
          String str="Hello World";
          String reverseString="";
          for(int i=str.length()-1;i>=0;i--){
                reverseString+=str.charAt(i);
          }
          System.out.println(reverseString);
    }
}