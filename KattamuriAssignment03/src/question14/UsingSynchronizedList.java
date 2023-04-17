package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UsingSynchronizedList {
	public static void main (String[] args)
    {
        List<String> syn =
           Collections.synchronizedList(new ArrayList<String>());
 
        syn.add("Vyshnavi");
        syn.add("is intrested");
        syn.add("in programming");
 
        synchronized(syn)
        {
            // must be in synchronized block
            Iterator itr = syn.iterator();
 
            while (itr.hasNext())
                System.out.println(itr.next());
        }
    }
}
