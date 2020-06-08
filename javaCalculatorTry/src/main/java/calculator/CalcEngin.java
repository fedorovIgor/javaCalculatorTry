package calculator;

import java.awt.event.*;
import javax.swing.JButton;


public class CalcEngin implements ActionListener  {

	private SimpleCalculator calkParent;

	CalcEngin(SimpleCalculator calkParent) {
		this.calkParent = calkParent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton clickButton = (JButton) e.getSource();

		String clickedButtonLabel = clickButton.getText();

		calkParent.setDisplayValue(clickedButtonLabel);
			
	}	
}
