package collection;

import java.util.TreeMap;

public class Ex8TreeMap {

	public static void main(String[] args) {
		/* Tree Map:
		 1. it will not allow duplicate key(If you add duplicate key it will over write the 
		 value).
		 2. it will allow duplicate values.
		 3. element can be retrieved by natural sorting order(based on key value).
		 4. it will "not allow" null key(If you add null key, then treemap can't compare
		 null key with other key's. so we can not add null values.)
		 5.*/
		
		TreeMap<Integer,String> treemap=new TreeMap<Integer,String>();
		treemap.put(4, "Lilly");
		treemap.put(5, "jomi");
		treemap.put(3, "samy");
		treemap.put(1, "Jesus");
		treemap.put(2, "johanna");
		
		System.out.println(treemap);//{1=Jesus, 2=johanna, 3=samy, 4=Lilly, 5=jomi}
		
		treemap.put(4, "jesus1");
//if you add dupli/- keys,treemap will over write the values.
		System.out.println(treemap);//{1=Jesus, 2=johanna, 3=samy, 4=jesus1, 5=jomi}
		
		//treemap.put(null, "jesus1");
		// if you add null key it will give null pointer exception.
		
		
		
		
		
		
		
	}

}
