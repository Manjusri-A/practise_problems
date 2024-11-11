package practise_problems;

public class primeOfN {
	

	    
	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static int findNthPrime(int n) {
	        int count = 0;  
	        int number = 1; 
	      
	        while (count < n) {
	            number++;
	            if (isPrime(number)) {
	                count++; 
	            }
	        }

	        return number; 
	    }

	    public static void main(String[] args) {
	        int n = 10;
	        System.out.println("The " + n + "th prime number is: " + findNthPrime(n));
	    }
	

}
