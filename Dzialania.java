
package ulamek;


public class Dzialania {

   
    public static Ulamek dodaj(Ulamek u1 , Ulamek u2){
       int l;
       int m;
        if(u1.getMianownik() == u2.getMianownik()){
            l = u1.getLicznik() + u2.getLicznik();
            Ulamek u3 = new Ulamek(l , u1.getMianownik());
            return u3;
        }
        else{
            m = u1.getMianownik()*u2.getMianownik();
            l = (u1.getLicznik()*u2.getMianownik()) + (u2.getLicznik()*u1.getMianownik());
            Ulamek u3 = new Ulamek(l , m);
            return u3;
        }
        
    }
    
    public static LiczbaU dodaj(LiczbaU l1 , int i){
        int c;
        c = l1.getCalosc() + i;
        LiczbaU l2 = new LiczbaU(c , l1.getUlamek());
        return l2;
    }
    
    
    public static LiczbaU dodaj(LiczbaU l1 , LiczbaU l2){
        Ulamek u1 = transfer(l1);
        Ulamek u2 = transfer(l2);
        Ulamek u3 = dodaj(u1,u2);
        LiczbaU l3 = transfer(u3);
        
        return l3;
        
    }
    
    public static LiczbaU dodaj(LiczbaU l1 , Ulamek u1){
        Ulamek u2 = transfer(l1);
        Ulamek u3 = dodaj(u2 , u1);
        LiczbaU l2 = transfer(u3);
        
        return l2;
        
    }
    
    public static Ulamek transfer(LiczbaU l1){
        int l;
        l=l1.getCalosc()*l1.getUlamek().getMianownik() + l1.getUlamek().getLicznik();
        Ulamek u1 = new Ulamek(l ,l1.getUlamek().getMianownik());
        return u1;
    }
    
    public static LiczbaU transfer(Ulamek u1){
        int calosc;
        calosc = u1.getLicznik()/u1.getMianownik();
        Ulamek ulamek = new Ulamek(u1.getLicznik()%u1.getMianownik() , u1.getMianownik());
        LiczbaU l1 = new LiczbaU(calosc , ulamek);
        return l1;
    }
    
    public static Ulamek plusPol(Ulamek u){
        Ulamek v = dodaj(u , new Ulamek(1,2));
        return v;
    }
    
    public Odcinek plusPol(Odcinek o){
        Ulamek a = Dzialania.dodaj(o.getLewy() , new Ulamek(1,2));
        Ulamek b = Dzialania.dodaj(o.getPrawy() , new Ulamek(1,2));
        Odcinek c = new Odcinek(a,b);
        return c;
    }
}
