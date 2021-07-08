package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex2AboutLinkedList {

	public static void main(String[] args) {
		
		/* LinkedList: 1.is best for insertion and removing. but it is worst for searching.
		LinkedList implements those interfaces but it doesn't implements "Random access"
		interfaces that's why it couldn't perform searching option effectively.
		2.it's also maintain the insertion order and allow duplicate element.*/
		
		LinkedList< Integer> list= new LinkedList< Integer>();
		
		list.add(1);
		list.add(10);
		list.add(56);
		list.add(76);
		list.add(76);
		list.add(76);
		list.add(10);
		System.out.println(list); //[1, 10, 56, 76,76,76,10]
		
		// add element in the 1st position
		list.addFirst(40);
		System.out.println(list);		//[40, 1, 10, 56, 76, 76, 76, 10]
		
		// add element in the last position
		list.addLast(89);
		System.out.println(list);		//[40, 1, 10, 56, 76, 76, 76, 10, 89]
		
		// get the 1st value using getFirst()method
		System.out.println(list.getFirst());		//40
		
		// get the 1st value using "Index position"
		System.out.println(list.get(0));			//40
		System.out.println(list.get(3));			//56
		
		// removeFirst and removeLast
		System.out.println(list.removeFirst());		//40
		System.out.println(list.removeLast());		//89
		
		// remove() will delete the first element
		System.out.println(list.remove());			//1
		
		// poll() will remove the first element
		System.out.println(list.poll());			//10
		
		// removeFirstOccuranceOf
		list.removeFirstOccurrence(76);
		System.out.println(list);				//[56, 76, 76, 10]
		
		// removeLastOccuranceOf
		list.removeFirstOccurrence(76);
		System.out.println(list);				//[56, 76, 10]
		
		// iteration using for loop 
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));		// 56 76 10
		}
		
		// iteration using enhanced for loop
		for(Integer st:list) {
			System.out.println(st);				// 56 76 10
		}System.out.println("------------------------");
		
		// iterate using while loop
		int num=0;
		while(list.size()>num) {
			System.out.println(list.get(num));
			num++;
		}System.out.println("ccccc------------------------");
		
		// iterate using do while loop
		int num1=0;
		do {
			System.out.println(list.get(num1));
			num1++;
		}while(list.size()>num1);
		System.out.println("------------------------");
		
		// Using Iterator 
		Iterator<Integer> iterator =list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
