package collection;

import java.util.HashMap;

public class Ex6HashMap {

	public static void main(String[] args) {
		/* Map:
		  1.map is not the child interface of the collection. and hence it's not consider
		  to be a true collection.
		  2.It represents data in Key_value pair.
		  3. It will not allow duplicate key.
		  4. But it will allow duplicate values.
		  5. it will allow only one null key(If you add one more null key it will over 
		  write the values.)
		  Example of Map is: 
		  1.Employee Number(Key)   Employee Name(value)
		  2. pincode(key)   city name(value)
		  3. student roll no(key)   name(value)
		    */
		/*HashMap:
		 1. hashmap(c)is the implementation class for map
		 2. it's not allow duplicate key but it will allow duplicate value.
		 3.  only one NULL key allowed.
		 4. we can't predict the retrieval order.
		 5. a value of map only be fetched using it's key.
		 6. it's not synchronished so if it has to be used on multithreading.  */
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>(); 
		hashmap.put(1, "Jesus");
		hashmap.put(2, "samy");
		hashmap.put(3, "jomi");
		hashmap.put(4, "johanna");
		hashmap.put(1, "jomi");
		hashmap.put(null, "lilly");
		hashmap.put(5, "jesus1");
		hashmap.put(null, "lolly");
		
		System.out.println(hashmap);	//{null=lolly, 1=jomi, 2=samy, 3=jomi, 4=johanna, 6=jesus1}

		// to make a copy of the existing map:
		HashMap<Integer,String> duplimap=new HashMap<Integer,String>();
		duplimap.putAll(hashmap);
		System.out.println(duplimap);//{null=lolly, 1=jomi, 2=samy, 3=jomi, 4=johanna, 5=jesus1}
		
		// to delete the map:
		duplimap.clear();
		System.out.println(duplimap);		//{}
		
		//to check the key is present or not
		System.out.println(hashmap.containsKey(1));		//true
		
		// to check the value is present or not
		System.out.println(hashmap.containsValue("jomi"));	//true
		
		// clone the map
		System.out.println(hashmap.clone());//{null=lolly, 1=jomi, 2=samy, 3=jomi, 4=johanna, 5=jesus1}
		
		//check the map is empty or not
		System.out.println(hashmap.isEmpty());//false
		
		/*fetch the set of keys in the map so use keySet() method, because set is not allowed
		duplicate values */
		System.out.println(hashmap.keySet());//[null, 1, 2, 3, 4, 5]
		
		// fetch a value
		System.out.println(hashmap.get(3));	//jomi
		
		//fetch all the values
		System.out.println(hashmap.values());//[lolly, jomi, samy, jomi, johanna, jesus1]
		
		// fetch all the keys and values
		System.out.println(hashmap.entrySet());//[null=lolly, 1=jomi, 2=samy, 3=jomi, 4=johanna, 5=jesus1]
		
		
		
		
		
		
		
		
	}

}
