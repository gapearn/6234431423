
import java.io.PrintStream;

public class InsectPopulationTestor {
    public static void main(String[] args){
        InsectPopulation insectnum = new InsectPopulation(10);
        insectnum.breed();
        insectnum.spray();
        System.out.println("Number of insects: "+insectnum.getNumInsect()); 
        insectnum.breed();
        insectnum.spray();
        System.out.println("Number of insects: "+insectnum.getNumInsect());  
        insectnum.breed();
        insectnum.spray();
        System.out.println("Number of insects: "+insectnum.getNumInsect()); 
    }
    
}
