package VectorPack;

import java.util.Vector;

public class Vector8 {

	public static void main(String[] args) {
		Vector V = new Vector(4, 3);
		
		V.add("Elder");
		V.add("Younger");
		
		System.out.println("My Vector Capacity is : " +V.capacity());
		
		V.add("father");
		V.add("Mother");
		System.out.println("My Vector Capacity with 4 elements is : " +V.capacity());
		V.add("wife");
		System.out.println("My Vector Capacity with 4+ elements is : " +V.capacity());
		V.add("Elder");
		V.add("Younger");
		V.add("father");
		System.out.println("My Vector Capacity with 7+ elements is : " +V.capacity());
		
		System.out.println(V.firstElement());
		System.out.println(V.lastElement());
		
		

	}

}
