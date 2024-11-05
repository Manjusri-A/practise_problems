package practise_problems;

public class Stringreverse {

	public static void main(String[] args) {
		String str ="welcome";
		 String rev="";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			rev = ch +rev;
		}
       System.out.println(rev);
	}

}
