package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex4LinkedHashSet {

	public static void main(String[] args) {
		/* LinkedHashSet:
		 * 1. can maintain insertion order
		 * 2. it will not allow duplicate elements
		 * 3. Underlying DS is Hashtable+linkedlist
		 * 4. it allows null values
		 * 5. can insert heterogenenous objects (If generics are not used)
		 * 6. data stored on hash code so search is effective */
		
		Set linkedhashset=new LinkedHashSet();
		linkedhashset.add("Jesus");
		linkedhashset.add(1);
		linkedhashset.add(null);
		linkedhashset.add("Jesus1");
		linkedhashset.add(1);
		System.out.println(linkedhashset); //[Jesus, 1, null, Jesus1]
		
		linkedhashset.remove(1);
		System.out.println(linkedhashset);	//[Jesus, null, Jesus1]
		
		Iterator iterator = linkedhashset.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
	}

}
