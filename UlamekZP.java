
package ulamek;

public class UlamekZP extends Ulamek {
    
    int staryLicznik;
    int staryMianownik;
    int licz=0;
    
    public UlamekZP(int licznik, int mianownik) {
        super(licznik, mianownik);
    }
    
    @Override
    void plus(Ulamek u){
        super.plus(u);
        int m = getMianownik() * u.getMianownik();
        int l1 = getLicznik() * u.getMianownik();
        int l2 = u.getLicznik() *getMianownik();
        staryLicznik = l1-l2;
        staryMianownik = m;
    }
    
    void cofnij(){
        if(licz<1){
        setLicznik(staryLicznik);
        setMianownik(staryMianownik);
        licz++;
        }
        else System.out.println("Błąd");
    }
    
    public boolean sprawdz(){
        if(licz>=1)
            return false;
        else return true;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + "Dostępne cofniecie: "+ sprawdz();
    }
    
}
