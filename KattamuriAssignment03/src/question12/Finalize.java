package question12;

public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize f = new Finalize();
		f = null;
		System.gc();
		System.out.println("Output in main method");
	}	
	@Override
	protected void finalize() {
		System.out.println("Output in finalize method");
	}


}


