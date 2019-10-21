package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random random = new Random();
	int lotteryNum1 = random.nextInt(101);
	int lotteryNum2 = random.nextInt(101);
	int lotteryNum3 = random.nextInt(101);
	int lotteryNum4 = random.nextInt(101);
	int lotteryNum5 = random.nextInt(101);
	JOptionPane.showMessageDialog(null, "Your lottery ticket is: " + lotteryNum1 + " " + lotteryNum2 +  " " + lotteryNum3 +  " " + lotteryNum4 + " " +  lotteryNum5);
}
}
