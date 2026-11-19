package VectorPack;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		Vector V = new Vector();
		
		V.add("Hello");
		V.add(false);
		V.add("Uday");
		V.add(46.3F);
		V.add(true);
		V.add("paarrot");
		V.add("Ready");
		V.add(456352);
		V.add(false);
		
		System.out.println("The Default Capacity of vector is : " +V.capacity());
		
		V.add("Friday");
		System.out.println("The Capacity of vector with 10 elements is : " +V.capacity());
		
		V.add("David");
		System.out.println("The Capacity of vector with 10+ elements is : " +V.capacity());
		
		

	}

}
