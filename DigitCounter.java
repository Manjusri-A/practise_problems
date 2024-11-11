package practise_problems;

public class DigitCounter {

	    public static int countDigits(int number) {
	        int count = 0;
	        number = Math.abs(number);

	        if (number == 0) {
	            return 1;
	        }

	        
	        while (number != 0) {
	            number = number / 10;
	            count++;
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        int number = 12345;
	        System.out.println("Number of digits: " + countDigits(number)); 
	    }
	

}
