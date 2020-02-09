package lab4_1;

public class SodaCan {
    private double height;
    private double radius;
    private double volume;
    private double surface;
    
    public SodaCan(double x,double y){
        height =x;
        radius = y/2;
    }
    public double getVolume(){
        volume = radius*radius*height*3.14159265359;
        return volume;
    }
    public double getSurfaceArea(){
        surface = 2*radius*height*3.14159265359 + 2*radius*radius*3.14159265359;
        return surface;
    }
}
