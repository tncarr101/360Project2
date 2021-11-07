public class MarketingManager extends Employee {


    public MarketingManager(String fName, String lName, String address, String SSNum) {
        super(fName, lName, address, SSNum);
    }

public double bonus(int productsSold) {
        if(productsSold > 1000) {
            double onePercentSalary = super.annualPay * 0.01;
            super.annualPay = 500 + onePercentSalary;
        }

    return annualPay;
    }
}
