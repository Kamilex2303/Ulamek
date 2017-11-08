
package ulamek;

public class Odcinek {
    private Ulamek lewy;
    private Ulamek prawy;
    
    public Ulamek getLewy(){
        return lewy;
    }
    public Ulamek getPrawy(){
        return prawy;
    }
    
    public void setLewy(Ulamek lewy){
        this.lewy = lewy;
    }
    public void setPrawy(Ulamek prawy){
        this.prawy = prawy;
    }
    Odcinek(Ulamek lewy , Ulamek prawy){
        this.lewy = lewy;
        this.prawy = prawy;
    }
    
    @Override
    public String toString(){
        return lewy+" , "+prawy;
    }
}
