package ArrayListPack;

import java.util.ArrayList;

public class ALClass7 {

	public static void main(String[] args) {
		ArrayList H = new ArrayList();
	
		H.add(4567);          //0
		H.add(false);         //1
		H.add("Uday");        //2
		H.add(46.3F);         //3
		H.add(true);          //4
		H.add("paarrot");     //5
		H.add("Ready");       //6
		H.add("456352");        //7
		H.add(false);         //8
		H.add("Ink");         //9
		H.add("Calling");     //10
		
		System.out.println(H);
		
		ArrayList N = new ArrayList();
		
		N.add(4567);          //0
		N.add(false);         //1
		N.add("Uday");        //2
		N.add(46.3F);         //3
		N.add(true);          //4
		N.add("paarrot");     //5
		N.add("Ready");       //6
		N.add(456352);        //7
		N.add(false);         //8
		N.add("Ink");         //9
		N.add("Calling");     //10
		
		System.out.println(N);
		
	System.out.println(H.equals(N));	
		
		
		

	}

}
