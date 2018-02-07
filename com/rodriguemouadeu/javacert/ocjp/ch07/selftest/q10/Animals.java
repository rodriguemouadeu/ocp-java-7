package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q10;

import java.io.IOException;

public class Animals {
	
	class Lamb implements Closeable {
		public void close(){
			throw new RuntimeException("a");
		}	
	}

	public static void main(String[] args) {
		Animals a = new Animals();
		a.run();
	}

	public void run() {
		try(Lamb lamb = new Lamb();){
			throw new IOException();
		} catch(Exception e){
			throw new RuntimeException("e");
		}
	}	
}
