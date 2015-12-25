package com.home.sxq.thinkinjava.structuer.Dec.sixth.hashEq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountedString {
	private static List<String> created = new ArrayList<String>();
	private String s;
	private int id = 0;

	public CountedString(String str) {
		this.s = str;
		created.add(str);
		for (String _str : created) {
			id++;
		}
	}

	public String toString() {
		return "String:" + s + " id:" + id + " hashcode:" + hashCode();
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + s.hashCode();
		result = 37 * result + id;
		return result;
	}

	public boolean equals(Object o) {
		return o instanceof CountedString && s.equals(((CountedString) o).s) && id == ((CountedString) o).id;
	}

	public static void main(String[] args) {
		Map<CountedString, Integer> map = new LinkedHashMap<CountedString, Integer>();
		CountedString[] cs = new CountedString[5];
		for(int i = 0 ; i < cs.length ; i++){
			cs[i] = new CountedString("hi");
			map.put(cs[i], i);
		}
		System.out.println(map);
		for (int i = 0; i < cs.length; i++) {
			System.out.println("look up :"+cs[i]);
			System.out.println(map.get(cs[i]));
		}
	}

}
