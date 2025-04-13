import java.util.*;
public class longestSubStringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> seen=new HashSet<>();
        int maxLength=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            while(seen.contains(s.charAt(end))){
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(s.charAt(end));
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
    public static void main(String args[]){
        String s="abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: "+lengthOfLongestSubstring(s));
    }
}

//time complexity: O(n), where n is the length of the string s. This is because we are iterating through the string once with two pointers (start and end) to find the longest substring without repeating characters. The inner while loop may run at most n times in total, as each character is added and removed from the HashSet at most once.