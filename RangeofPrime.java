package practise_problems;

public class RangeofPrime {
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

	    
	    public static int sumOfPrimes(int start, int end) {
	        int sum = 0;
	        for (int i = start; i <= end; i++) {
	            if (isPrime(i)) {
	                sum += i; 
	            }
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        int start = 10;
	        int end = 50;
	        System.out.println("Sum of prime numbers between " + start + " and " + end + ": " + sumOfPrimes(start, end));
	    }
	

}
