package practise_problems;

public class CharacterFrequency {

	public static void main(String[] args) {
		   String str = "hello world";
		   int count=0;
		   char ch;
		   char c = 'o';
		   for (int i=0; i<str.length(); i++) {
			   ch = str.charAt(i);
			   if(ch==c) {
				  count=count+1;
			   }
			   
		   }
		   System.out.println(count);
	}

}
