public class Main {
    public static void main(String[] args) {
        Employee Tim = new Employee("Tim", "11/11/1985","01/01/2020");
        System.out.println(Tim);
        System.out.println("Age = " + Tim.getAge());
        System.out.println("Pay = " + Tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990","03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

    }
}
