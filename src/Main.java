import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //region PUNTO 1
        /// A)
        Rectangle r = new Rectangle(2.5, 3.0);

        // C)
        System.out.println(" Area = " + r.calculateArea());
        System.out.println(" Length = " + r.calculatePerimetre());

        ///B)
        System.out.println(" High = " + r.getHigh());
        System.out.println(" Width = " + r.getWidth());
        /// D)
        r.setHigh(5.5);
        r.setWidth(2.8);

        /// E)
        System.out.println(" Area = " + r.calculateArea());
        System.out.println(" Length = " + r.calculatePerimetre());

        /// F)

        Rectangle r1 = new Rectangle();

        System.out.println(" High = " + r1.getHigh());
        System.out.println(" Width = " + r1.getWidth());

        System.out.println(" Area = " + r1.calculateArea());
        System.out.println(" Length = " + r1.calculatePerimetre());

        //endregion

        //region PUNTO 2

        Employee em1 = new Employee(25000, " Carlos Gutiérrez ", 23456345);
        Employee em2 = new Employee(27500, " Ana Sanchez ", 34234123);

        System.out.println(" Salary $ " + em1.getSalary() + " Name " + em1.getNameAndLastname() + "DNI:" + em1.getDni());
        System.out.println(" Salary $ " + em2.getSalary() + " Name " + em2.getNameAndLastname() + "DNI:" + em2.getDni());

        System.out.println(" Total salary  = $" + em1.increaseSalary(em1, 25000));

        //endregion

        //region PUNTO 3

        Sale item = new Sale(1, " Yerba", 5, 900, 10);
        Sale item1 = new Sale(2, " Yerba", 25, 900, 10);
        item.product();
        item1.product();

        //endregion

        //region PUNTO 4

        bankCount count = new bankCount(1, "Camila Perez, ", 15000);

        System.out.println(" BankCount [ ID: 1" + " Camila Perez " + " Balance: $15000" + "]");

        System.out.println(" CREDITO + 2500 -> " + " Balance: $ " + count.credito(2500) + "]");

        System.out.println(" DEBITO - 1500 ->" + " Balance: " + count.debito(1500) + "]");

        System.out.println(" DEBITO -30000: ");
        count.debito(30000);

    }
}