package com.home.sxq.thinkinjava.structuer.Dec.sixth.hashEq;

public class Individual implements Comparable<Individual> {
	private static long counter = 0;
	private final long id = counter++;
	private String name;

	public Individual(String name) {
		this.name = name;
	}

	public Individual() {

	}

	public String toString() {
		return getClass().getSimpleName() + (null == name ? "" : " " + name);
	}

	public long id() {
		return id;
	}

	public boolean equals(Object o) {
		return o instanceof Individual && id == ((Individual) o).id;
	}

	public int hashCode() {
		int result = 17;
		if (null != name) {
			result = 37 * result + name.hashCode();
		}
		result = 37 * result + (int) id;
		return result;
	}

	public int compareTo(Individual o) {
		String first = getClass().getSimpleName();
		String argFirst = o.getClass().getSimpleName();
		int clzComp = first.compareTo(argFirst);
		if (0 != clzComp) {
			return clzComp;
		}
		if (null != name && null != o.name) {
			int nameComp = name.compareTo(o.name);
			if (0 != nameComp) {
				return nameComp;
			}
		}
		return (o.id < id ? -1 : (o.id == id ? 0 : 1));
	}
	public static void main(String[] args) {
		
	}
}
