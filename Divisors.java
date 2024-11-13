package practise_problems;

import java.util.Scanner;

public class Divisors {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		for(int i=1; i<=number; i++) {
			if(number % i ==0) {
			System.out.println("divisors are:" + i);
			}
		}
		
	}

}
