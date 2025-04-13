import java.util.HashSet;

public class duplicateElement {
    
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.print("Duplicate elements: ");
        for (int dup : duplicates) {
            System.out.print(dup + " ");
        }
    }
}

//Time Complexity: O(n) - where n is the number of elements in the array.