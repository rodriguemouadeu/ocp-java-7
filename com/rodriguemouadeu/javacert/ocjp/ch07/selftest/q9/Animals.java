package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q9;

public class Animals {

    class Lamb implements AutoCloseable{

        public void close(){
            System.out.println("Closing");
        }
    }

    public static void main(String[] args) {
        new Animals().run();
    }

    public void run(){

        try(Lamb lamb = new Lamb();){
            System.out.println("Running");
        } finally {
            System.out.println("And finally...");
        }
    }
}
