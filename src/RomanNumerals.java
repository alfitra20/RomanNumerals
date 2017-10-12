import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class RomanNumerals {
	public int convertToInteger(String romanNum) throws RomanNumeralException {
		int total = 0;
		boolean check_R1_repetition = checkR1Repetition(romanNum);
		boolean check_R2_repetition = checkR2Repetition(romanNum);
		
		if (check_R1_repetition == true) {
			throw new RomanNumeralException();
		}else {
			if (check_R2_repetition == true) {
				throw new RomanNumeralException();
			}else {
				total = calculateTotal(romanNum);
			}
		}
		return total;
	}
	
	public boolean checkR1Repetition(String roman) {
		boolean check = roman.matches("([I]{4,})*([X]{4,})*([C]{4,})*([M]{4,})*"); // || roman.matches("[X]{4,}")  || roman.matches("[C]{4,}")  || roman.matches("[M]{4,}");
		//System.out.println(check);
		return check;
	}
	public boolean checkR2Repetition(String roman) {
		boolean check = roman.matches("([V]{2,})*([L]{2,})*([D]{2,})*");
		return check;
	}
	public int calculateTotal(String romanNum) {
		String[] array = romanNum.split("(?!^)");
		int[] number = new int[50];
		
		for (int i = 0; i<array.length;i++) {
			switch (array[i]) {
				case "I" : 	number[i] = 1;
							break;
				case "V" : 	number[i] = 5;
							break;
				case "X" : 	number[i] = 10;
							break;
				case "L" : 	number[i] = 50;
							break;
				case "C" : 	number[i] = 100;
							break;
				case "D" : 	number[i] = 500;
							break;
				case "M" : 	number[i] = 1000;
							break;
				default  :  break;
			}
		}
		return	IntStream.of(number).sum();
	}
}
