package practise_problems;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		if(number%2 == 0) {
			System.out.println("even");
		}else
		{
			System.out.println("odd");
		}
	}

}
