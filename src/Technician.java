public class Technician extends Employee {

    double overtimeHours;
    double overtimePay;

    public Technician(String fName, String lName, String address, String SSNum) {
        super(fName, lName, address, SSNum);
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public double calculateOvertimePay(int overtimeHours) {
        overtimePay = overtimeHours * 1.5;
        return overtimePay;

    }

}
