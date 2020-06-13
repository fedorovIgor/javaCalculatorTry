package javaCalculatorTry.src.main.java.calculator;


public class Calculate {

	private Calculate () {}
	
	public static String  calck (int numberOne, int numberTwo, String sign) {
		int solution = 0;
		
		switch(sign) {
			
			case "+" : solution = numberOne + numberTwo;
				break;
			case "-" : solution = numberOne - numberTwo;
				break;
			case "*" : solution = numberOne * numberTwo;
				break;
			case "/" : solution = numberOne / numberTwo;
				break;
		}
			
		return String.valueOf(solution);	
	}
}
