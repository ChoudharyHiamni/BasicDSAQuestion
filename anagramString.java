import java.util.*;
public class anagramString {
    
    public static void main(String args[]){
        String s1="listen";
        String s2="silent";
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.println("Strings are anagram of each other");
        }else{
            System.out.println("Strings are not anagram of each other");
        }
    }
}
