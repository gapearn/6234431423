package lab3_3;

public class CashRegister{
    private final double tax;
    private double balance;
    private double money;
    private double taxtotal;
    private Object math;
    public CashRegister(double t){
        tax=t;
    }
    public void recordPurchase(double purchase){
        balance=balance+purchase;
    }
    public void recordTaxablePurchase(double taxpay){
        taxtotal=taxtotal+(taxpay*(100+tax)/100);
        balance=balance+(taxpay*(100+tax)/100);
    }
    public double getTotalTax(){
        return taxtotal;
    }
    public void enterPayment(double payment){
        money=money+payment;
    }
    public double giveChange(){
        double change = Math.round((money-balance)*100)/100.0;
        balance=0;
        money=0;
        return change;
    }

}