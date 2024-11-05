package practise_problems;

public class Stringlength {

	public static void main(String[] args) {
		String str = "welcome";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=0) {
				count += 1;
			}
		}
		System.out.println(count);
	}

}
