package question12;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {    
	        System.out.println("Inside  the try block");  
	        int data=20/0;    
	        System.out.println(data);    
	      }   
	    catch (ArithmeticException e){  
	        System.out.println("Arithmetic Exception occurred "+ e);   
	      }     
	    finally {  
	        System.out.println("Inside finally block");  
	      }      
	}


	}


