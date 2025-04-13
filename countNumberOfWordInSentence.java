import java.util.*;
public class countNumberOfWordInSentence {
    
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a sentence:");
         String sentence=sc.nextLine();
         String[] words = sentence.split("\\s+");
        
         // Output the number of words
         System.out.println("Number of words in the sentence is: " + words.length);

    }
}
