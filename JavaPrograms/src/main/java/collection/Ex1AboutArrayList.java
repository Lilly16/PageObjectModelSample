package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex1AboutArrayList {

	public static void main(String[] args) {
		
/* Array List: 1.Arraylist is best use for "search operation" and performs worst for insertion
and deletion.Arraylist implements those "Random access"
		interfaces that's why it performs searching option effectively.
		2. it will allow duplicate elements.
		3. it will maintain insertion order. */
		
		List<String > arraylist=new ArrayList<String>();
		
		// 1.it will maintain the insertion order. 2. It will allow duplicate elements
		arraylist.add("Jesus");
		arraylist.add("Samy");
		arraylist.add("Jomi");
		arraylist.add("Johanna");
		arraylist.add("Johanna");
		arraylist.add(5, "Lilly");
		arraylist.add(null);
		arraylist.add(null);
		System.out.println(arraylist);		//[Jesus, Samy, Jomi, Johanna, Johanna, Lilly, null, null]
		
		// If you want to retrieve the element you can use"get", "indexOf","lastIndexOf"
		System.out.println(arraylist.get(0)); 					//Jesus
		System.out.println(arraylist.indexOf("Johanna")); 		//3
		System.out.println(arraylist.lastIndexOf("Johanna"));  	//4
		
		/*If you want to copy all the elements in one list to another list use"addAll()"
		 If you want to remove all the elements use "clear()" */
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arraylist);
		System.out.println(anotherList);	//[Jesus, Samy, Jomi, Johanna, Johanna, Lilly, null, null]
		anotherList.clear();
		System.out.println(anotherList);		//[]
	
		// If you want to remove particular element use "remove()"
		arraylist.remove(5);
		System.out.println(arraylist);	//[Jesus, Samy, Jomi, Johanna, Johanna, null, null]
		arraylist.remove("Johanna");
		System.out.println(arraylist);	//[Jesus, Samy, Jomi, Johanna, null, null]

		// In array list we can add "null" elements
		arraylist.add(null);
		System.out.println(arraylist); //[Jesus, Samy, Jomi, Johanna, null, null, null]
		
		//want to update particular position in the list you can use "set" method.
		arraylist.set(1, "samyJ");
		System.out.println(arraylist);  //[Jesus, samyJ, Jomi, Johanna, null, null, null ]
		
		//check the list is empty or not use the method "isEmpty"
		System.out.println(arraylist.isEmpty());  //false
		
		//Iterate
		
		// 1st solution:
		for(String st:arraylist) {
			System.out.println(st);
		}
		
		// 2nd solution:
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
			
		//Using ListIterator we can traverse through both direction ie) forward and backward
			
			// traversing forward direction using "hasNext()" and "next()" method
			
			ListIterator<String> list_iter=arraylist.listIterator();
			while(list_iter.hasNext()) {
				System.out.println(list_iter.next());
			}
			
			//traversing backward direction using "hasPrevious()" and "previous()" method
			while(list_iter.hasPrevious()) {
				System.out.println(list_iter.previous());
			}System.out.println("-----------------");
			
		// Using Iterator we can traverse only through forward direction:
			Iterator<String> iterator=arraylist.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
			
		/* ConcurrentModificationExpection is: we've a list when we're iterating that time
			if we're adding or removing any element then we will get this exception*/
			/*
			 * for(String st:arraylist) {
				System.out.println(st);
				arraylist.add("Mary");
			} */
			
		// If the arraylist is not generic then we can add any data type
			// But this is not the good way
			List list =new ArrayList();
			list.add(2);
			list.add("Jesus");
			list.add(true);
			System.out.println(list);
			
		}
	}

}
