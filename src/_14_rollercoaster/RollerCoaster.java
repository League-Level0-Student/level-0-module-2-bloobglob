package _14_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How tall are you?(In inches)");
	int height = Integer.parseInt(input);
	if(height>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You need to grow more first.");
	}
}
}
