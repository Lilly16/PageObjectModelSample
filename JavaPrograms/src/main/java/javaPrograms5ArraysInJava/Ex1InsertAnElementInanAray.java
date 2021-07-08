package javaPrograms5ArraysInJava;

public class Ex1InsertAnElementInanAray {

	public static void main(String[] args) {

		// declaring an Array:
		int[] a=new int[5];
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		
		}System.out.println("\n");
		
		// inserting the values of an array
		int[]b=new int[4];
		b[0]=6;
		b[1]=56;
		b[3]=5;
		for(int i=0;i<b.length;i++) {
		System.out.print(b[i]+" ");
		}System.out.println("\n");
		
		// Another way of inserting the values of an array
		
		for(int i=0;i<b.length;i++) {
			b[i]=i;
			System.out.println(b[i]+" ");
		}
		
	}

}
