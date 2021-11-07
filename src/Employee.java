public class Employee {

    String fName;
    String lName;
    String address;
    String SSNum;
    int monthlyPay;
    double annualPay;

    public Employee(String fName, String lName, String address,  String SSNum) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.SSNum = SSNum;
    }

    public String getAddress() {
        return address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getSSNum() {
        return SSNum;
    }

    public int setMonthPaymentRate(int monthlyPayRate) {
        monthlyPay = monthlyPayRate;
        return monthlyPay;
    }

    public double calculateAnnualPay(int monthlyPay) {
        annualPay = monthlyPay * 12;
        return annualPay;
    }

}
