package com.home.sxq.thinkinjava;

public class MapArray<K, V> {
	private Object[][] pairs;
	private int index;

	public MapArray(int length) {
		pairs = new Object[length][2];
	}

	public void put(K key, V value) {
		if (index > pairs.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		pairs[index++] = new Object[] { key, value };
	}

	@SuppressWarnings("unchecked")
	public V get(K key) {
		for (int i = 0; i < index; i++) {
			if (key.equals(pairs[i][0])) {
				return (V) pairs[i][1];
			}
		}
		return null;
	}
    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 12) ? 12 : n + 1;
    }
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < index; i++) {
			result.append(pairs[i][0].toString());
			result.append(":");
			result.append(pairs[i][1]);
			if (i < index - 1) {
				result.append("\n");
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		MapArray<String, String> map = new MapArray<String, String>(4);
		map.put("first", "犯我中华者");
		map.put("second", "虽远必诛");
		map.put("third", "战狼");
		try{
			map.put("fourth", "座右铭");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("超过限制长度");
		}
		System.out.println(map.toString());
		System.out.println(map.get("third"));
	}
}
