package ulamek;



class Ulamek {

   
    
    private int licznik;
    private int mianownik;
    
    public Ulamek(int licznik , int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;
    }
    public int getLicznik(){
        return licznik;
    }
    public int getMianownik(){
        return mianownik;
    }
    public void setLicznik(int licznik){
        this.licznik = licznik;
    }
    public void setMianownik(int mianownik){
        this.mianownik = mianownik;
    }
    void plus(Ulamek u){
        if(mianownik == u.getMianownik()){
            licznik += u.getLicznik();
        }
        else{
            licznik = ((licznik*u.getMianownik()) + (u.getLicznik()*mianownik));
            mianownik = mianownik*u.getMianownik();
        }
    }
   @Override
   public String toString(){
       return this.licznik+"/"+this.mianownik;
   }
    
    
    
}
