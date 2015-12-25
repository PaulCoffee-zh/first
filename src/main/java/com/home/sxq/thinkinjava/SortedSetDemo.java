package com.home.sxq.thinkinjava;

import java.util.Iterator;
import java.util.TreeMap;

public class SortedSetDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> sortedmap = new TreeMap<Integer, String>(new CountingMapData(10));
		System.out.println(sortedmap);
		Integer low = sortedmap.firstKey();
		Integer high = sortedmap.lastKey();
		System.out.println("low:"+low+",high:"+high);
		Iterator<Integer> it = sortedmap.keySet().iterator();
		for (int i = 0; i < 6; i++) {
			if(i == 3){
				low = it.next();
				System.out.println(low);
			}
			if(i == 6){
				high = it.next();
				System.out.println(high);
			} else{
				System.out.println(it.next());
			}
		}
		System.out.println("low:"+low+",high:"+high);
		System.out.println(sortedmap.subMap(low, high));
		System.out.println(sortedmap.headMap(high));
		System.out.println(sortedmap.tailMap(low));
	}
}
