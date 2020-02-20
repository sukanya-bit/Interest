package interest;

import java.io.IOException;
import java.util.Scanner;

public class Interest {
	
	private static double amount, rate, interest;
	private static int year;
	private static Scanner scan = new Scanner(System.in);

	@SuppressWarnings("static-access")
	public Interest() {
		this.amount = 0.0;
		this.rate = 0.0;
		this.year = 0;
		this.interest = 0;
	}
	
	public void input() throws IOException {
		System.out.write("\n Enter the amount : ".getBytes());
		amount = scan.nextDouble();
		System.out.write("\n Enter the rate : ".getBytes());
		rate = scan.nextDouble();
		System.out.write("\n Enter the year : ".getBytes());
		year = scan.nextInt();
	}
	
	public double simple_in() {
		return ((amount * rate * year) / 100);
	}
	
	public double compound_in() {
		double act_amount = amount;
		for(int i = 0; i < year; i++) {
			interest = ((amount * rate) / 100);
			amount = amount + interest;
		}
		return (amount - act_amount);
	}
	
	public void output(double ans) throws IOException {
		System.out.write(("\n The interest is : " + ans).getBytes());
	}

}
