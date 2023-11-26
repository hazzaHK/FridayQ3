package FridayQ;

import java.util.HashMap;
import java.util.Map;
public class FriQ4 {

	public static void main(String[] args) {
		String colors1 = "brown-green";
		String colors2 = "brown-green-violet";
		
		int resistance1 = decodeResistance(colors1);
		int resistance2 = decodeResistance(colors2);
		
		System.out.println(colors1 + " = " + resistance1);
		System.out.println(colors2 + " = " + resistance2);
    }
	 public static int decodeResistance(String colors) {
		 String[] colorBands = colors.split("-");
		 Map<String, Integer> colorValues = getColorValues();
		 
		 int resistance = 0;
	     int position = 1;
	        
	        for (int i = 0; i < Math.min(colorBands.length, 2); i++) {
	        	 String color = colorBands[i];
	        	if (colorValues.containsKey(color)) {
	        		 resistance = (resistance * 10) + colorValues.get(color);
	                 position *= 10;
	             }
	         }
	        return resistance;
	         }
	 public static Map<String, Integer> getColorValues() {
		 Map<String, Integer> colorValues = new HashMap<>();
		 	colorValues.put("black", 0);
	        colorValues.put("brown", 1);
	        colorValues.put("red", 2);
	        colorValues.put("orange", 3);
	        colorValues.put("yellow", 4);
	        colorValues.put("green", 5);
	        colorValues.put("blue", 6);
	        colorValues.put("violet", 7);
	        colorValues.put("grey", 8);
	        colorValues.put("white", 9);
	        return colorValues;
	        
	}

}
