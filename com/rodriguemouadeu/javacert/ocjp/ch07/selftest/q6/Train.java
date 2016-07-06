package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q6;

public class Train {
	
	class RanOutOfTrackException extends Exception {}
	class AnotherTrainComingException extends Exception {}

	public static void main(String[] args) throws RanOutOfTrackException, AnotherTrainComingException {
		Train a = new Train();
		try{
			a.drive();
			System.out.println("Tou!  Tou!");
		} catch (Exception e){		
			System.out.println("Error driving");
			throw e;	
		}
	}

	public void drive() throws RanOutOfTrackException, AnotherTrainComingException {
		throw new RanOutOfTrackException();
	}	
}

