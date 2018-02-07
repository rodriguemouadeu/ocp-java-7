package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q12;

public class Concert {
      static class PowerOutage extends Exception{}
      static class Thunderstorm extends Exception{}

      public static void main(String... args){
          try{
              new Concert().listen();
              System.out.println("a");
          } catch(PowerOutage | Thunderstorm e){
              e = new PowerOutage();
              System.out.println("b");
          } finally{
              System.out.println("c");
          }
      }

      private static void listen() throws PowerOutage, Thunderstorm{
          System.out.println("listening");
      }
}
