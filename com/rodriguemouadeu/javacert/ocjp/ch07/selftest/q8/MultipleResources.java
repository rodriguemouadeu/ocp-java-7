package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q8;

public class MultipleResources {

    class Lamb implements AutoCloseable {
        public void close(){
            System.out.println("l");
        }
    }

    class Goat implements AutoCloseable {
        public void close(){
            System.out.println("g");
        }
    }

    public void run() throws Exception {
      try (Lamb l = new Lamb();
           System.out.print("t");
           Goat g = new Goat()){
          System.out.println("2");
      } finally {
        System.out.println("f");
      }
    }

    public static void main(String[] args) throws Exception {
        new MultipleResources().run();
    }
}
