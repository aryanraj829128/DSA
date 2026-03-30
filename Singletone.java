package oodp2.Singletone;

public class Singletone {
   private Singletone(){

   }
   private static Singletone instance;

   public static Singletone getInstance(){
       //check whether one object is only created or not
       if(instance == null){
           instance= new Singletone();
       }
       return instance;

   }


}
