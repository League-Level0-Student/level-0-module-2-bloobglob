package _15_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("How old are you?(In years)");
	int age = Integer.parseInt(input);
	if(age>18) {
		JOptionPane.showMessageDialog(null, "Who should be the next president?");
	}else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
	}
}


}

