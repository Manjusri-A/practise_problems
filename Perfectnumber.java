package practise_problems;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		Scanner num =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = num.nextInt();
		
		if(CheckPerfect(number)) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("non perfect number");
		}
	}
	 public static boolean CheckPerfect(int number){
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
		return sum == number;
	}

}
