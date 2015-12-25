package com.home.sxq.thinkinjava.structuer.Dec.sixth.hashEq;

public class Groundhog {
	protected int number;

	public Groundhog(int n) {
		this.number = n;
	}

	public String toString() {
		return "groundhog #" + number;
	}
	public int hashCode(){
		return number;
	}
	public boolean equals(Object o){
		return o instanceof Groundhog && (number == ((Groundhog)o).number);
	}
}
