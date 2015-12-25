package com.home.sxq.web.code;

/**
 * @author Administrator
 *
 */
public class Singleton {
	private Singleton(){
		System.out.println("i am structure");
	}
	public static Singleton singleton = new Singleton();
	
	public static void openMethod(){
		System.out.println("i am open m5ethod");
	}
	public static void main(String[] args) {
		singleton.openMethod();
	}
}
