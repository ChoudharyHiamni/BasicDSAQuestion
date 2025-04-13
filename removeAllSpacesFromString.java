import java.util.*;
public class removeAllSpacesFromString {
    
    public static void main(String args[]){
        String str="hello world";
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                result+=str.charAt(i);
            }
        }
        System.out.println("String without space:"+result);
    }
}

// Time Complexity: O(n) - where n is the length of the string