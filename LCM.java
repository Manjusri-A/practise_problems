package practise_problems;

public class LCM {
	

	    public static int lcm(int a, int b) {
	        int max = Math.max(a, b);

	       
	        while (true) {
	            if (max % a == 0 && max % b == 0) {
	                return max; 
	            }
	            max++;
	        }
	    }

	    public static void main(String[] args) {
	        int a = 12;
	        int b = 18;
	        System.out.println("LCM of " + a + " and " + b + " is: " + lcm(a, b)); 
	    }
	

}
