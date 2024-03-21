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


    }
}