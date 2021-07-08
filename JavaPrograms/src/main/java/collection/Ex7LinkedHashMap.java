package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Ex7LinkedHashMap {

	public static void main(String[] args) {
		/* Linked Hash Map:
		 1. duplicate key are not allowed.
		 2.duplicate values are allowed.
		 3. the order is preserved. ie) it can maintain order of insertion.
		 4. only one NULL key is allowed.(If you add one more null keys it will over write
		 the values of keys.)
		 5.the value of map can only be fetched using it's key.
		 6.it is not synchronised so it can be used in multithreading environment.it 
		 has to be synchronised explicitly. */
		
		LinkedHashMap<String,String> linkmap = new LinkedHashMap<String,String>();
		linkmap.put("samy","lilly");
		linkmap.put("Jesus","Christ");
		linkmap.put("ly","Jeba");
		linkmap.put("Jomi","lilly");
		linkmap.put("raja","Johanna");
		linkmap.put("raja","jonny");//dupli/- key(raja)will over write the value ie) jonny
		linkmap.put(null,"John");
		System.out.println(linkmap);
		/*{samy=lilly, Jesus=Christ, ly=Jeba, Jomi=lilly, raja=Johanna, , null=John}
		 look at the result linkedhashmap maintain the insertion order*/
		
		HashMap<String,String> hashmap = new HashMap<String,String> ();
		hashmap.put("samy","lilly");
		hashmap.put("Jesus","Christ");
		hashmap.put("ly","Jeba");
		hashmap.put("Jomi","lilly");
		hashmap.put("raja","Johanna");
		System.out.println(hashmap);
		/*{Jomi=lilly, raja=Johanna, Jesus=Christ, ly=Jeba, samy=lilly}
		 look at the result hashmap maintain is not maintain the insertion order
		 */
		
		
		
		
		
	}

}
