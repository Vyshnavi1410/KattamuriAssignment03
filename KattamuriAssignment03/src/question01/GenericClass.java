package question01;

public class GenericClass<Type> {
	private Type i;

	   public void add(Type i) {
	      this.i = i;
	   }

	   public Type get() {
	      return i;
	   }

	   public static void main(String[] args) {
		   GenericClass<Integer> integer = new GenericClass<Integer>();
	    
	      integer.add(new Integer(10));

	      System.out.println(integer.get());
	    }
}
