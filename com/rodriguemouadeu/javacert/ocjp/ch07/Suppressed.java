package com.rodriguemouadeu.javacert.ocjp.ch07;

import java.io.IOException;

public class Suppressed {
	
	public static void main(String[] args){
	
		try(One one = new One()){
			throw new Exception("Try");
		} catch(Exception e){ 
			System.out.println("Catch");
			System.out.println(e.getMessage());
			for(Throwable t : e.getSuppressed()){
				System.out.println("Suppressed: " + t);
			}
		} finally {
			System.out.println("Finally");
		}
	}
}

class One implements AutoCloseable {
	public void close() throws IOException {
		throw new IOException("Closing");
	}
}

