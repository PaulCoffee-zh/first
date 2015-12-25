package com.home.sxq.thinkinjava.structuer.Dec.sixth.hashEq;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class SpringDetector {
	public static <T extends Groundhog> void detectSpring(Class<T> type)
			throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<Groundhog, Prediction> map = new HashMap<Groundhog, Prediction>();
		for (int i = 0; i < 10; i++) {
			map.put(ghog.newInstance(i), new Prediction());
		}
		System.out.println("map:" + map);
		Groundhog gh = ghog.newInstance(3);
		System.out.println(gh);
		if (map.containsKey(gh)) {
			System.out.println(gh);
		} else {
			System.out.println("key not found" + gh);
		}
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		detectSpring(Groundhog.class);
	}
}
