
package ulamek;


class LiczbaU {
    
    private int calosc;
    private Ulamek ulamek;
    
    LiczbaU(int calosc , Ulamek ulamek){
        this.calosc =calosc;
        this.ulamek = ulamek;
    }
    
    public int getCalosc(){
        return calosc;
    }
    
    public Ulamek getUlamek(){
        return ulamek;
    }
    
    public void setCalosc(){
        this.calosc = calosc;
    }
    
    public void setUlamek(){
        this.ulamek = ulamek;
    }
    
    @Override
    public String toString(){
        return this.calosc+" i "+this.ulamek;
    }
    
    
    
}
