
public class CannnonBallTester {
    public static void main(String[] args) {
    CannonBall ball = new CannonBall(100); //กำหนดความเร็วตั้งต้นให้ลูกกระสุนปืนใหญ่มีค่าเป็น 100 m/sec
    ball.simulatedFlight();
    System.out.print("Final distance: ");
    System.out.printf("%.3f",ball.getSimulatedDistance());
    System.out.print(" Total time: ");
    System.out.printf("%.2f",ball.getSimulatedTime());
    System.out.print("\nDistance from calculus equation: ");
    System.out.printf("%.3f",ball.calculusFlight(ball.getSimulatedTime()));     
    System.out.println();
    }
}
