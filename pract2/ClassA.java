package pract2;

public class ClassA {
	public static void main(String[] args) {
		String s="welcome to java class";
		String[] split = s.split(" ");
		for (String a : split) {
			char ca = a.charAt(0);
			char upperCase = Character.toUpperCase(ca);
			String substring = a.substring(1);
			
			String  output = upperCase+substring+" ";
			System.out.print(output);
		}
	}
	
	

}
