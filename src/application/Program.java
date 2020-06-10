package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("******* Ternary operation *******");
		System.out.print("Enter price: ");
		double price = sc.nextDouble();
		double discount = (price < 20) ? (price * 0.1) : (price * 0.05);
		System.out.println("Discount: " + discount);
		sc.close();

	}

}
