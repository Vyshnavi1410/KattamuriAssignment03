package question24;

public class GarbageCollection {
	protected void finalize() throws Throwable{
		System.out.println("Finalize method is called,garbage collector triggered");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollection gc = new GarbageCollection();
		System.out.print("Calling garbage collector before making null");
		System.gc();
		gc = null;
		System.out.print("Calling garbage collector after making null");
		System.gc();
	}
		
}
