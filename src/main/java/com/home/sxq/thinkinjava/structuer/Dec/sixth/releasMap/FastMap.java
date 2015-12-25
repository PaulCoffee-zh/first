package com.home.sxq.thinkinjava.structuer.Dec.sixth.releasMap;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class FastMap<K, V> extends AbstractMap<K, V> {
	static final int SIZE = 997;
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];

	public V put(K k, V v) {
		V old = null;
		int index = Math.abs(k.hashCode()) % SIZE;
		if (buckets[index] == null) {
			buckets[index] = new LinkedList<MapEntry<K, V>>();
		}
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(k, v);
		boolean found = false;
		ListIterator<MapEntry<K,V>> it = bucket.listIterator();
		while(it.hasNext()){
			MapEntry<K,V> iPair = it.next();
			if(iPair.getKey().equals(k)){
				old = iPair.getValue();
				it.set(pair);
				found = true;
				break;
			}
		}
		if(!found){
			buckets[index].add(pair);
		}
		return old;
	}
	
	public V get(Object k){
		int index = Math.abs(k.hashCode())%SIZE;
		if(buckets[index] == null){
			return null;
		}
		for(MapEntry<K,V> entry : buckets[index]){
			if(entry.getKey().equals(k)){
				return entry.getValue();
			}
		}
		return null;
	}
	
	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<Map.Entry<K,V>>();
		for(LinkedList<MapEntry<K, V>> bucket : buckets){
			if(bucket == null){
				return null;
			}
			for(MapEntry<K, V> map : bucket){
				set.add(map);
			}
		}
		return set;
	}
	public static void main(String[] args) {
		FastMap<String, String> m = new FastMap<String, String>();
//		m.putAll();
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}
