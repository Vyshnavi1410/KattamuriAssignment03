package question23;

public class ThreadSafe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Vyshnavi";
		name.concat("Kattamuri");
		System.out.println("name : " +name);
		Thread tem = new Thread(new Runnable() {
		public void run() {
		name.concat("Rames");
		System.out.println("Thread: " +name);
		}
		});
		Thread t = new Thread(new Runnable() {
		public void run() {
		name.concat("h");
		System.out.println("Thread1 : " +name);
		}
		});
		tem.start();
		t.start();
		}

}
