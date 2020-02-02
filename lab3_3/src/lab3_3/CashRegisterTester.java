package lab3_3;

public class CashRegisterTester{
    public static void main(String[] args){
        CashRegister goods = new CashRegister(7);
        goods.recordPurchase(50);
        goods.recordPurchase(10);
        goods.recordTaxablePurchase(20);
        goods.enterPayment(100);
        System.out.println("Your change is "+goods.giveChange());
    }
}

