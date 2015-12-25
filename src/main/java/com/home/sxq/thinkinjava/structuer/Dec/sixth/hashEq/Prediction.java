package com.home.sxq.thinkinjava.structuer.Dec.sixth.hashEq;

import java.util.Random;

public class Prediction {
	private static Random rand = new Random(47);
	private boolean shadow = rand.nextDouble() > 0.5;
	public String toString(){
		if(shadow){
			return "weather still cold";
		}else{
			return "weather be colder";
		}
	}
}
