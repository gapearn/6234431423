import java.awt.Rectangle;
import java.util.Random;

public class Lab2_1 {
    public static void main(String[] args) {
        Random generator= new Random();
        int x = generator.nextInt(50)+1;
        int y = generator.nextInt(50)+1;
        int width = generator.nextInt(50)+1;
        int height = generator.nextInt(50)+1;
        Rectangle r1 = new Rectangle(x,y,width,height);
        int a = generator.nextInt(50)+1;
        int b = generator.nextInt(50)+1;
        int wid = generator.nextInt(50)+1;
        int heig = generator.nextInt(50)+1;
        Rectangle r2 = new Rectangle(a,b,wid,heig);
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        String sq = Boolean.toString(r3.isEmpty());
        System.out.println("Is the intersected rectangle empty?:"+sq);
        
    }

}
