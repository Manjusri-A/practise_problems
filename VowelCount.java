package practise_problems;

public class VowelCount {

	public static void main(String[] args) {
		String str = "welcome to programming";
		int count=0;
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch== 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count+=1;
			}
		}
       System.out.println(count);
	}

}
