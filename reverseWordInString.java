import java.util.*;
public class reverseWordInString {   
    
        public static String reverseWords(String s){
             String [] words= s.split(" ");
             StringBuilder reversedString=new StringBuilder();

             for(int i=words.length-1;i>=0;i--){
                    reversedString.append(words[i]).append(" ");
             }
             return reversedString.toString().trim();
        }
    
        public static void main(String[] args) {
            String s = "the sky is blue";
            System.out.println(reverseWords(s)); // Output: "blue is sky the"
        }
    }
    
