package practise_problems;

public class Palindrome {

	public static void main(String[] args) {
		String str ="welcome";
		 String rev="";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			rev = ch +rev;
		}
      
      if(rev == str) {
    	  System.out.println(str + " is a palindrome");
      }
      else {
    	  System.out.println(str + " is not a palindrome");
      }

	}

}
