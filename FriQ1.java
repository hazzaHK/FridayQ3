package FridayQ;

public class FriQ1 {

	 public static void main(String[] args) {
	        int number = 1990;
	        String romanNumeral = convertToRoman(number);
	        System.out.println(number + " in Roman numerals is: " + romanNumeral);
	    }
	 public static String convertToRoman(int number) {
	        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	        
	        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	        
	        StringBuilder romanNumeral = new StringBuilder();
	        
	        for (int i = 0; i < arabicValues.length; i++) {
	            while (number >= arabicValues[i]) {
	            	 romanNumeral.append(romanSymbols[i]);
	                 number -= arabicValues[i];
	             }
	         }
	        return romanNumeral.toString();
	            }
	}


