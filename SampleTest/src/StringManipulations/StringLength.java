package StringManipulations;

public class StringLength {

	public static void main(String[] args) {
		
		String a = "TestingAutomation";
		
		System.out.println("The legnth of a string is " + a.length());
		
		for (int i = 0; i < a.length(); i ++){
			System.out.println(a.charAt(i));
		}

	}

}
