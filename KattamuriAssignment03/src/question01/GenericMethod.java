package question01;

public class GenericMethod {

	public static <Type> void printArray(Type[] i) {
		for(Type input: i) {
			System.out.print(input + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] n = {10,20,30};
		System.out.println("Generic method contains type Integer: ");
		printArray(n);
	}
}
