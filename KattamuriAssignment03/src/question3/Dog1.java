package question3;

public class Dog1 extends Dog {
	@Override
	Dog1 get() {
		return this;
	}
	void message()
	{
		System.out.println("welcome to covariant return type");
	}    
	
	public static void main(String args[]){    
		new Dog1().get().message();    
		}  
}
