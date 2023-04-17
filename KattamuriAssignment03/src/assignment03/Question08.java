package assignment03;

public class Question08 {
	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		}
		finally {
			System.out.println("Executing final block without catch block");
		}
	}
}
