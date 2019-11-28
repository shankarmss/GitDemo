package Coll;
import java.util.*;

public class Map {
	
	public static void main(String[] args){
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Shankar");
		hm.put(2, "Madhav");
		hm.put(3, "Johnson");
		hm.put(4, "Kishore");
		System.out.println(hm);
		Set sn = hm.entrySet();
		System.out.println(sn);
		Iterator i = sn.iterator();
		
		while (i.hasNext())
		{
			System.out.println(i.next());
			Map.Entry m = (Map.Entry)i.next();
		
		}	
	}
}
