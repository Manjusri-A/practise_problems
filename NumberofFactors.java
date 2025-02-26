package practise_problems;

import java.util.Scanner;

public class NumberofFactors {
	    
	    public static int countFactors(int number) {
	        int count = 0;

	        
	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) { 
	                count++; 
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int factorsCount = countFactors(number);
	        System.out.println("The number of factors of " + number + " is: " + factorsCount);

	        scanner.close();
	    }
	

}
