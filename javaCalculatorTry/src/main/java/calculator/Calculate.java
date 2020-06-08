package calculator;


public class Calculate {

	private Calculate () {}
	
	public static int  calck (int numberOne, int numberTwo, char sign) {
		int solution = 0;
		
		switch(sign) {
			
			case '+' : solution = numberOne + numberTwo;
				break;
			case '-' : solution = numberOne - numberTwo;
				break;
			case '*' : solution = numberOne * numberTwo;
				break;
			case '/' : solution = numberOne / numberTwo;
				break;
		}
			
		return solution;	
	}
}
