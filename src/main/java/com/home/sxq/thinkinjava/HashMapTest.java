package com.home.sxq.thinkinjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		MapArray<String, String> myMap = new MapArray<String, String>(3);
		myMap.tableSizeFor(12);
		Random random = new Random();
		String[] str = new String[1048576];
		for(int i = 0 ; i < 1 << 15 ; i ++){
			str[i] = String.valueOf((char) (65 + random.nextInt(26)));
//			map.put(i+"", String.valueOf((char) (65 + random.nextInt(26))));
		}
		System.out.println(Arrays.toString(str)+"--"+(1 << 20));
		System.out.println(myMap.tableSizeFor(12));
	}
}
