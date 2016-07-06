package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q5;

import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BadIO {
	
	public static void main(String[] args){
		BadIO a = new BadIO();
		try{
			a.fileBlowUp();
			a.databaseBlowUp();
			System.out.println("a");
		} catch (IOException | SQLException e){		
			System.out.println("b");	
		} catch(Exception e){ 
			System.out.println("c");
		} finally {
			System.out.println("Finally");
		}
	}

	public void fileBlowUp() throws IOException {
		throw new IOException();
	}	
	
	public void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}	
}

