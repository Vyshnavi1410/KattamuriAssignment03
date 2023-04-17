package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {
	public static void main (String[] args)
	{
        // creating a thread-safe Arraylist.
        CopyOnWriteArrayList<String> threadSafeList
            = new CopyOnWriteArrayList<String>();
 
        // Adding elements to synchronized ArrayList
        threadSafeList.add("Vyshnavi");
        threadSafeList.add("practises");
        threadSafeList.add("programming");
 
        System.out.println("Elements of synchronized ArrayList :");
 
        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> itr = threadSafeList.iterator();
 
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
