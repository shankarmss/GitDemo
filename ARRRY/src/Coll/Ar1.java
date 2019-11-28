package Coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ar1 {

	public static void main(String[] args) {

		ArrayList<Integer> A1 = new ArrayList<Integer>();
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Shankar");
		hm.put(2, "Madhav");
		hm.put(3, "Johnson");
		hm.put(4, "Kishore");
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		
		A1.add(1);
		A1.add(1);
		A1.add(1);
		A1.add(2);
		A1.add(2);
		A1.add(0, 3);
		System.out.println(A1.get(2));
		System.out.println(A1);
		System.out.println(A1.indexOf(3));
		A2.add(5);
		A2.add(12);
		A2.addAll(A1);
		System.out.println(A2);
		System.out.println(A1.size());
		System.out.println(A2.size());
		A2.clear();
		System.out.println(A2);
		A2.addAll(A1);
		System.out.println(A2);
		System.out.println(A2.contains(1));
		System.out.println(A2.contains(8));
		System.out.println(A2.getClass());
		Collections.sort(A2);
		System.out.println(A2);
		Collections.reverseOrder();
		System.out.println(A2);
		Collections.sort(A2,Collections.reverseOrder());
		System.out.println(A2);

		HashSet<Integer> A = new HashSet<Integer>();
		LinkedHashSet<Integer> B = new LinkedHashSet<Integer>();
		TreeSet<Integer> C =new TreeSet<Integer>();  
		A.addAll(A2);
		B.addAll(A2);
		C.addAll(A2);
		System.out.println("hi");
		System.out.println(A);
		/*A.add(4);
		A.add(4);
		A.add(10);
		A.add(5);*/
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		
	}	
}