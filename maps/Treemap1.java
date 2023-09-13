package com.maps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.setspractice.Mycomparator1;

public class Treemap1 {
	public static void main(String[] args) {
		 TreeMap<Integer, String> a=new TreeMap<>(new Mycomparator1());
		 a.put(20,"z");
		 a.put(1,"b");
		 a.put(5,"d");
		 a.put(10,"a");
		 System.out.println(a);
		 
			/*
			 * Set<Integer> b = a.keySet(); System.out.println(b);
			 * 
			 * Collection<String> c = a.values(); System.out.println(c);
			 * 
			 * Set<Entry<Integer, String>> d = a.entrySet(); System.out.println(d);
			 * 
			 * Iterator<Entry<Integer, String>> e = d.iterator(); // System.out.println(e);
			 * 
			 * while(e.hasNext()); Entry<Integer, String> f = e.next();
			 * System.out.println(f);
			 */
	}

}
