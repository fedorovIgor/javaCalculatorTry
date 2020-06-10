package calculator;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
 
	 private JTextField result;
	 
	 public void setDisplayValue(String val) {
		 result.setText(val);
	 }
	 
	 public String getDisplayValue() {
		 return result.getText();
	 }
	 
	 SimpleCalculator() {
		
			 // Create a panel
			 JPanel windowContent= new JPanel();

			 // Set a layout manager for this panel
			 windowContent.setLayout(new BorderLayout());
			 
			 
			 
			 // We create text field and Greed panels to put them into JPanel
			 JTextField answerField = new JTextField();
			 answerField.setHorizontalAlignment ( JTextField.RIGHT );
			 answerField.setFont(new Font("SansSerif", Font.BOLD, 25));
			 
			 JPanel numberPanel = new JPanel();
			 numberPanel.setLayout(new GridLayout(4,3));
			 
			 JPanel managerPanel = new JPanel();
			 managerPanel.setLayout(new GridLayout(4,1));
			 
			 
			 // Create some button for managing aplication
			 JButton numberOne = new JButton("1");
			 JButton numberTwo = new JButton("2");
			 JButton numberThree = new JButton("3");
			 JButton numberFour = new JButton("4");
			 JButton numberFive = new JButton("5");
			 JButton numberSix = new JButton("6");
			 JButton numberSeven = new JButton("7");
			 JButton numberEight = new JButton("8");
			 JButton numberNine = new JButton("9");
			 JButton numberZero = new JButton("0");
			 
			 JButton add = new JButton("+");
			 JButton multiply = new JButton("*");
			 JButton division = new JButton("/");
			 JButton difference = new JButton("-");
			 JButton point = new JButton(".");
			 JButton solution = new JButton("=");
			 
			 		
			 //Add controls to Greed panel
			 
			 numberPanel.add(numberSeven);
			 numberPanel.add(numberEight);
			 numberPanel.add(numberNine);
			 
			 numberPanel.add(numberFour);
			 numberPanel.add(numberFive);
			 numberPanel.add(numberSix); 
			 
			 numberPanel.add(numberOne);
			 numberPanel.add(numberTwo);
			 numberPanel.add(numberThree);
			 
			 numberPanel.add(numberZero);
			 numberPanel.add(point);
			 numberPanel.add(solution);
			 
			 
			 managerPanel.add(multiply);
			 managerPanel.add(division);
			 managerPanel.add(add);
			 managerPanel.add(difference);
			 
			 
			 
			 
			

			 // Add controls to the panel
			 windowContent.add(answerField, BorderLayout.NORTH);
			 windowContent.add(numberPanel, BorderLayout.CENTER);
			 windowContent.add(managerPanel, BorderLayout.EAST);
			 
			 
			 
			 //*****///
			 //CalcEngin callEgine = new CalcEngin(this);
			 //go.addActionListener(callEgine);
			 
			 
			 
			 // Create the frame and add the panel to it
			 JFrame frame = new JFrame("My First Calculator");

			 // Add the panel to top-level container
			 frame.setContentPane(windowContent);

			 // set the size and make the window visible
			 frame.setSize(420,210);
			 frame.setVisible(true);
		 	
	}
	 
 }
