import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	@Test
	public void test_number_conversion() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("II");
		
		assertEquals("I converted to",2, numberConverted);
	}
	//R1 Test
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R1_I() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("IIII");
	}
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R1_X() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("XXXXXXX");
	}
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R1_C() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("CCCCC");
	}
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R1_M() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("MMMMM");
	}

	//R2 Test
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R2_V() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("VV");
	}
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R2_L() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("LL");
	}
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R2_D() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("DD");
	}
	
	//R3 Test
	@Test
	public void test_repetition_R3_IX() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("IX");
		assertEquals("I converted to",9, numberConverted);
	}
	
	@Test (expected = RomanNumeralException.class)
	public void test_repetition_R3_IIX() throws RomanNumeralException {
		RomanNumerals roman = new RomanNumerals();
		int numberConverted = roman.convertToInteger("IIX");
	}
	


}
