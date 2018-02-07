package com.rodriguemouadeu.javacert.ocjp.ch07;

public class Two implements AutoCloseable {
	public void close(){
		System.out.println("Close Two");
	}
}
