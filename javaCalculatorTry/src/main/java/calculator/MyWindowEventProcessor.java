package javaCalculatorTry.src.main.java.calculator;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowEventProcessor extends WindowAdapter {
	
	MyWindowEventProcessor() {
		super();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("esaefe");
	}
}
		
