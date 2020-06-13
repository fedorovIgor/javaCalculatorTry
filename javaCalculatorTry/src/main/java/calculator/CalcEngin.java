package javaCalculatorTry.src.main.java.calculator;

import java.awt.event.*;
import javax.swing.JButton;


public class CalcEngin implements ActionListener  {

	private SimpleCalculator calkParent;
	private String currentMessage;
	
	private int numberInMemory;
	private String operator = null;
	//private String answer = null;
	
	
	CalcEngin(SimpleCalculator calkParent) {
		this.calkParent = calkParent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickButton = (JButton) e.getSource();
		String clickedButtonLabel = clickButton.getText();
		
		currentMessage = calkParent.getDisplayValue();


		if(clickedButtonLabel == "+" || clickedButtonLabel == "-" || 
				clickedButtonLabel == "*" || clickedButtonLabel == "/" || clickedButtonLabel == "=") {
			if(operator != null && operator != "=") {
				currentMessage = Calculate.calck(numberInMemory, Integer.parseInt(currentMessage), operator );
				numberInMemory = Integer.parseInt(currentMessage);
				operator = clickedButtonLabel;
			} else if (operator != null && clickedButtonLabel == "=") {
				currentMessage = Calculate.calck(numberInMemory, Integer.parseInt(currentMessage), operator );
				numberInMemory = Integer.parseInt(currentMessage);
				operator = null;
			}else {
				numberInMemory = Integer.parseInt(currentMessage);
				operator = clickedButtonLabel;
				currentMessage = "";
				
			}
		} else {
			currentMessage += clickedButtonLabel;
		}
		
		
		calkParent.setDisplayValue(currentMessage);	
	}	
}
