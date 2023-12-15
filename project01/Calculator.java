package project01;
import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;


public class Calculator extends JFrame {

	private JPanel panel;
	private JTextField tField;
	private JButton[] buttons;
	private String[] labels = {
		"Backspace", "","","CE","C",
		"7","8","9","/","sqrt",
		"4","5","6","x","%",
		"1","2","3","-","1/x",
		"0","+/-","_","+","=",
	};
	
	public Calculator() {
		tField = new JTextField(35);
		panel = new JPanel();
		tField.setText("0.");
		tField.setEnabled(false);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		
		for(int rows = 0; rows < 5; rows++) {
			for(int cols = 0; cols < 5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if( cols >= 3 )
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.blue);
				buttons[index].setForeground(Color.yellow);
				panel.add(buttons[index]);
				index++;
				
			}
		}
		
		add(tField,BorderLayout.NORTH);
		add(tField,BorderLayout.CENTER);
		setVisible(true);
		pack();
		
	}
	
	
	public static void main(String[] args) {
		Calculator s = new Calculator();
	}

}
