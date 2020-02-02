
public class InsectPopulation {
    private double i;
    boolean getNumInsect;
    
    public InsectPopulation(double amount){
        i = amount+i;
    }
    public void breed(){
        i = 2*i;
    }
    public void spray(){
        i=0.9*i;
    }
    public double getNumInsect(){
        return i;
    }
    
}
