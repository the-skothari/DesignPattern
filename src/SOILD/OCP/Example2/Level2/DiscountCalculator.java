package SOILD.OCP.Example2.Level2;

public class DiscountCalculator {
    public double calculate(DiscountStartegy customerType, double amt){
        return customerType.applyDiscount(amt);
    }
}
