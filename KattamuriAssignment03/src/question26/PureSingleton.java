package question26;

public class PureSingleton {
	private static volatile PureSingleton instance = null;
	private PureSingleton() {
		
	}
	public static PureSingleton getInstance() {
		if(instance==null) {
			synchronized (PureSingleton.class) {
				if(instance==null) {
					instance= new PureSingleton();
				}
				
			}
		}
		return instance;
	}
	    
}
