package ArrayListPack;

import java.util.ArrayList;

public class ALClass5 {

	public static void main(String[] args) {
		ArrayList H = new ArrayList();
	
		H.add(4567);          //0
		H.add(false);         //1
		H.add("Uday");        //2
		H.add(46.3F);         //3
		H.add(true);          //4
		H.add("paarrot");     //5
		H.add("Ready");       //6
		H.add(456352);        //7
		H.add(false);         //8
		H.add("Ink");         //9
		H.add("Calling");     //10
		
		System.out.println(H);
		
		ArrayList S = new ArrayList();
		S.add("Tiger");
		S.add("Movie");
		S.add(452342);
		S.add(true);
		
		System.out.println(S);
		
		H.addAll(S);
		
		System.out.println(H);
		
		
		

	}

}
