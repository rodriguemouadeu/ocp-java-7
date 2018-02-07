package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q11;

import java.io.IOException;

public class Animals {
  class Lamb implements AutoCloseable {
    public void close(){
      throw new RuntimeException("a");
    }
  }

  public static void main(String... args) throws IOException {
      new Animals().run();
  }

  public void run() throws IOException{
      try(Lamb l = new Lamb()){
          throw new IOException();
      } catch (Exception e){
          throw e;
      }
  }
}
