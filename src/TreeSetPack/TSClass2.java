package TreeSetPack;

import java.util.TreeSet;

public class TSClass2 {

	public static void main(String[] args) {
		TreeSet T = new TreeSet();
		
		T.add("foreigner");
		T.add("animal");
		T.add("steward");
		T.add("Glow");
		T.add("laundry");
		T.add("Creep");
		T.add("joint");
		T.add("tie");
		T.add("charm");
		T.add("stamp");
		T.add(564124); //java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
		T.add("hallway");
		T.add("innovation");
		T.add("rent");
		T.add("Substitute");
		T.add("Fair");
		T.add("reconcile");
		T.add("evening");
		
		System.out.println(T);
		
		

	}

}
