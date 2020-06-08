package calculator;

import javax.swing.*;
import java.awt.GridLayout;

public class SimpleCalculator {
 
	 private JTextField result;
	 
	 public void setDisplayValue(String val) {
		 result.setText(val);
	 }
	 
	 public String getDisplayValue() {
		 return result.getText();
	 }
	 
	 SimpleCalculator() {
		
			 // 1. Create a panel
			 JPanel windowContent= new JPanel();

			 // 2. Set a layout manager for this panel
			 GridLayout fl = new GridLayout(4,2);
			 windowContent.setLayout(fl);
			 
			 // 3. Create controls in memory
			 JLabel label1 = new JLabel("Number 1:");
			 JTextField field1 = new JTextField(10);
			 JLabel label2 = new JLabel("Number 2:");
			 JTextField field2 = new JTextField(10);
			 JLabel label3 = new JLabel("Sum:");
			 JButton go = new JButton("Add");
			 result = new JTextField(30);
			
			 
			 
			

			 // 4. Add controls to the panel
			 windowContent.add(label1);
			 windowContent.add(field1);
			 windowContent.add(label2);
			 windowContent.add(field2);
			 windowContent.add(label3);
			 windowContent.add(result);
			 windowContent.add(go);
			 
			 
			 //*****///
			 CalcEngin callEgine = new CalcEngin(this);
			 go.addActionListener(callEgine);
			 
			 
			 
			 //5. Create the frame and add the panel to it
			 JFrame frame = new JFrame("My First Calculator");

			 // 6. Add the panel to top-level container
			 frame.setContentPane(windowContent);

			 // 7. set the size and make the window visible
			 frame.setSize(400,100);
			 frame.setVisible(true);
		 	
	}
	 
 }
