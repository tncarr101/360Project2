class Main {
    public static void main(String[] args){

        System.out.println("Hello World");
        Employee employee1 = new Employee("Toni", "Carr", "3621 N Elm", "123456");

        System.out.println(employee1.getfName());
        System.out.println(employee1.setMonthPaymentRate(2000));
        System.out.println(employee1.calculateAnnualPay(2000));

        Technician tech1 = new Technician("Toni", "Carr", "3621 N Elm", "12345");
        System.out.println(tech1.calculateOvertimePay(5));

        Engineer eng1 = new Engineer("Toni", "Carr", "3621 N Elm", "12345");
        System.out.println(eng1.calculateAnnualPay(true));



    }

}

