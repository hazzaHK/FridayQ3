package FridayQ;

public class FriQ2 {

	public static void main(String[] args) {
		
		int number = 28;
        String raindropSounds = convertToRaindropSounds(number);
        System.out.println("Raindrop sounds for " + number + ": " + raindropSounds);
    }
	
	 public static String convertToRaindropSounds(int number) {
	        StringBuilder result = new StringBuilder();
	        if (number % 3 == 0) {
	            result.append("Pling");
	        }
	        if (number % 5 == 0) {
	            result.append("Plang");
	        }
	        if (number % 7 == 0) {
	            result.append("Plong");
	        }
	        if (result.length() == 0) {
	            result.append(String.valueOf(number));
	        }
	        return result.toString();
	}

}
