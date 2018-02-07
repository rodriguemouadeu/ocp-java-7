package com.rodriguemouadeu.javacert.ocjp.ch07.selftest.q7;

public class Conductor {

    static String s = "-";

    class Whistle implements AutoCloseable{

        public void tout(){

            s += "t";
        }

        public void close(){
           s += "c";
        }

    }

    public void run(){
      try(Whistle w = new Whistle();){
          w.tout();
          s += "1";

          throw new Exception();
      } catch (Exception e){
          s += "2";
      } finally {
          s += "3";
      }
    }

    public static void main(String... args){
        new Conductor().run();
        System.out.println(s);
    }
}
