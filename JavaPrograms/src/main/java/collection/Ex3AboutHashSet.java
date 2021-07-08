package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex3AboutHashSet {

	public static void main(String[] args) {
		/* Set(I)---> HashSet(c) ---> LinkedHashSet(c) are implementations
		 * Set(I)---> SortedSet(child interface)-->NavigableSet(I)-->TreeSet(c)is the implementation
		 * Set: it will not allow duplicate ele and it will not maintain insertion order
		 * we can insert heterogenous objects(it generics are not used.)
		 * HashSet:  1. It will not allow duplicate values
		 * 2. It will not maintain insertion order.
		 * 3. we can insert heterogeneous objects (if "generics are not used"). it we add duplicate
		 * value it will return false, it won't throw any error.
		 * 4. data stored based on "hash code" so search is very effective.
		 * 5. it will allow null value */
		
		HashSet<String>  hashSet=new HashSet<String>();
		hashSet.add("Jesus");
		hashSet.add("samy");
		hashSet.add("jomi");
		hashSet.add("johanna");
		hashSet.add("lilly");
		hashSet.add("jomi");
		hashSet.add(null);
		
		System.out.println(hashSet);  //[jomi, null, Jesus, johanna, samy, lilly]don't have jomi 2 times
		System.out.println(hashSet.contains("lilly")); //true
		System.out.println(hashSet.remove("lolly"));	//false
		hashSet.remove("jomi");
		System.out.println(hashSet);	//[null, Jesus, johanna, samy, lilly]
		
		//Iterator
		
		Iterator iterator= hashSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		HashSet<String> hashSet1=new HashSet<String>();
		hashSet1.addAll(hashSet);
		System.out.println(hashSet1);
		
		hashSet1.clear();
		System.out.println(hashSet1);		//[]
		
		hashSet.clone();
		System.out.println(hashSet);		//[null, Jesus, johanna, samy, lilly]
		
		System.out.println(hashSet.equals(hashSet1));		//false
		
		System.out.println(hashSet.isEmpty());
		
		
		
		
		
		
		
	}

}
