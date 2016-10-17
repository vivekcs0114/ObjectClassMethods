package com.avalia.methods;

public class Finalize {
	public static void main(String[] args) {
		Finalize f = new Finalize();
		
				try {
			f.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
				Class<? extends Finalize> s = f.getClass();
				System.out.println(s.getName());

	}
}
