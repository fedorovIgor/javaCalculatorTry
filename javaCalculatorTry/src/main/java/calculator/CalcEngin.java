package calculator;

import java.awt.event.*;
import javax.swing.JButton;


public class CalcEngin implements ActionListener  {

	private SimpleCalculator calkParent;
	private String message;
	
	private int first;
	private int second;
	private String operator;
	
	
	CalcEngin(SimpleCalculator calkParent) {
		this.calkParent = calkParent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickButton = (JButton) e.getSource();
		String clickedButtonLabel = clickButton.getText();
		
		message = calkParent.getDisplayValue();
		
		/*
		if(clikedButtonLabel == '+') {
			this.first = Integer.parseInt(message);
			this.operator = '+';
			message = "";
		}
		*/
			
		
		message += clickedButtonLabel;
		
		calkParent.setDisplayValue(message);	
	}	
}
