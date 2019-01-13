package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(int x, int y) throws IllegalArgumentException{
		if(y == 0) {
			throw new IllegalArgumentException();
		}
		return x/y;
	}
	
	public String reverseString(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException();
		}
		String output = "";
		for (int i = s.length() - 1; i > -1; i--) {
			output += s.charAt(i);
		}
		return output;
	}
}
