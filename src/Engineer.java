public class Engineer extends Employee {

    int bonus = 5000;


    public Engineer(String fName, String lName, String address, String SSNum) {
        super(fName, lName, address, SSNum);
    }

    public double calculateAnnualPay( boolean receiveBonus) {

        if(receiveBonus == true){
            super.annualPay+= bonus;
        }

        return annualPay;
    }
}