package FridayQ;

import java.util.Arrays;
public class FriQ3 {

	public static void main(String[] args) {

		String word1 = "stop";
        String word2 = "pots";
        
        boolean areAnagrams = checkAnagram(word1, word2);
        
        if (areAnagrams) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
        	 System.out.println(word1 + " and " + word2 + " are not anagrams.");
        	 
        }
	}
	 public static boolean checkAnagram(String word1, String word2) {
		// Convert both words to lowercase
	        word1 = word1.toLowerCase();
	        word2 = word2.toLowerCase();
	        
	   // Remove whitespace from both words
	        word1 = word1.replaceAll("\\s", "");
	        word2 = word2.replaceAll("\\s", "");
	        
	  // Convert words to character arrays and sort them
	        char[] charArray1 = word1.toCharArray();
	        char[] charArray2 = word2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
	        // Compare the sorted character arrays
	        return Arrays.equals(charArray1, charArray2);
        }

	}
