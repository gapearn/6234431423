package lab4_1;

import java.util.Scanner;

public class SodaTester {
    
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        System.out.print("Enter height: ");
        Double h = value.nextDouble();
        
        Scanner diameter = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        Double d = diameter.nextDouble();
        
        SodaCan newobject = new SodaCan(h, d);
        System.out.printf("Volume: %.2f\n",newobject.getVolume());
        System.out.printf("Surface area: %.2f\n",newobject.getSurfaceArea());
    }
    
}
