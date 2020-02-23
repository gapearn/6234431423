
public class CannonBall {

    private double initV; //ความเร็วตั้งต้น
    private double simS; //ระยะทางที่คำนวณได้จากวิธี simulation
    private double simT; //เวลาที่ใช้ในวิธี simulation
    public static final double g = 9.81;
    
    public CannonBall(double v){
        initV = v;
    }
    
    public void simulatedFlight(){
        int count = 0;
        while (initV > 0){
            simT = simT + 0.01;
            simS = simS + initV*0.01;
            initV = initV - g*0.01;
            count = count + 1;
            if (count%100==0){
                System.out.print("Distance on "+count/100+"sec: ");
                System.out.printf("%.3f",simS);
                System.out.println();    
            }
        }  
    }
   
    public double getSimulatedDistance(){
        return simS;
    }
    
    public double getSimulatedTime(){
        return simT;
    }
    
    public double calculusFlight(double t){
        simS = 0;
        simT = t;
        initV = 100;
        simS = (-0.5)*g*t*t + initV*t;
        return simS;
    }
     
}
