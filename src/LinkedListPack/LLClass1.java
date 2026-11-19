package LinkedListPack;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLClass1 {

	public static void main(String[] args) {
		LinkedList H = new LinkedList();
		
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
		
		H.addFirst("Morning");
		H.addLast("Evening");
		
		System.out.println(H);
		
		H.removeFirst();
		H.removeLast();
		
		System.out.println(H);
		
		

	}

}
