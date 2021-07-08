package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex5TreeSet {

	public static void main(String[] args) {
		/* Tree Set:
		 * 1. tree set implementation of sortedset(I)and navigableset(I)
		 * 2. it will not allow duplicate elements.
		 * 3. elements will retrived on natural sorting order(descending)
		 * 4. Underlying DS is binary search tree
		 * 5. heterogenous objects are not allowed.
		 * 6.  it won't allow "null" values, after java 1.6 version */
		
		TreeSet<Integer>  treeSet= new TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(100);
		treeSet.add(1);
		treeSet.add(40);
		treeSet.add(7);
		treeSet.add(9);
		treeSet.add(5);
		System.out.println(treeSet);		//[1, 5, 7, 9, 10, 40, 100]
		
		// first element
		System.out.println(treeSet.first());	// 1
		
		// last element
		System.out.println(treeSet.last());		//100
		
		//higher value
		System.out.println(treeSet.higher(40));	//100
		
		// headSet() it will give less than given value "excluding" that particular value
		System.out.println(treeSet.headSet(9)); //[1, 5, 7]
		
		// tailSet() it will give higher than the given value "including" that particular value
		System.out.println(treeSet.tailSet(10));	//[10, 40, 100]
		
		/* subSet() it will give value of particular interval "only including minimum value"
		 * for example subSet(2,9) means it will add 2 but not 9 */
		System.out.println(treeSet.subSet(7, 40)); //[7, 9, 10]
		
		// *************comparator************* imp question
		//if we're not mention particular order then will give null
		System.out.println(treeSet.comparator()); 	// null
		
		//pollFirst() it will give first element and same time it will remove that element
		System.out.println(treeSet);					//[1, 5, 7, 9, 10, 40, 100]
		System.out.println(treeSet.pollFirst());        //1
		System.out.println(treeSet);					//[5, 7, 9, 10, 40, 100]
		
		//pollLast() it will give last ele and remove that element
		System.out.println(treeSet);				//[5, 7, 9, 10, 40, 100]	
		System.out.println(treeSet.pollLast());		//100	
		System.out.println(treeSet);				//[5, 7, 9, 10, 40]	
		
		System.out.println("-------------------------");
		System.out.println(treeSet.descendingSet());	//[40, 10, 9, 7, 5]
		
		//Normal Iteration
		Iterator<Integer> iterator= treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}System.out.println("-------------------------");//5 7 9 10 40
		
		// DesendingIterator
		Iterator<Integer> decendingItera=treeSet.descendingIterator();
		while(decendingItera.hasNext()) {
			System.out.println(decendingItera.next());// 40 10 9 7 5
		}
		
		
		
		
		
		 
		
		
		
		
		
		
	}

}
