package VectorPack;

import java.util.Vector;

public class Vector7 {

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
		
		
		

	}

}
