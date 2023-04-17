package question25;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> salaries = new ArrayList<Integer>();  
        salaries.add(2000);  
        salaries.add(4000);  
        salaries.add(8000);  
        salaries.add(9000);  
        salaries.add(7000);
        System.out.println("forEach Method");  
        salaries.forEach(salary -> System.out.println(salary)); 
	}	



	}


