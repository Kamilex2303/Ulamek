
package ulamek;


public class Main {

    public static void main(String[] args) {
       Ulamek u1 = new Ulamek(1,3);
       UlamekZP u2 = new UlamekZP(1,3);
     
       u2.plus(new Ulamek(1,2));
       
       System.out.println(u2);
       
       u2.cofnij();
       
       System.out.println(u2);
       
       u2.cofnij();
       
       
      
    }

    
}
