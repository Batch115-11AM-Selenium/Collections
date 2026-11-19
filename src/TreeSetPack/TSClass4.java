package TreeSetPack;

import java.util.Iterator;
import java.util.TreeSet;

public class TSClass4 {

	public static void main(String[] args) {
		TreeSet T = new TreeSet();
		
		T.add(658326);
		T.add(675623);
		T.add(345453);
		T.add(835121);
		T.add(43657);
		T.add(992435);
		T.add(22564);
		T.add(116833);
		T.add(36832);
		T.add(33789);
		T.add(564124); 
		T.add(53);
		T.add(45623);
	
		
		System.out.println(T);
		
	Iterator E = T.descendingIterator();
	
	System.out.println(E);
		
		

	}

}
