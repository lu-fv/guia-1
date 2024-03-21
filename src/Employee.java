import java.sql.SQLOutput;

public class Employee {

    private Integer salary;
    private String nameAndLastname;
    private Integer dni;

    public Employee (Integer salary, String nameAndLastname, Integer dni){

        this.salary = salary;
        this.nameAndLastname = nameAndLastname;
        this.dni = dni;
    }

    public Integer getSalary(){
        return this.salary;
    }

    public String getNameAndLastname() {
        return nameAndLastname;
    }

    public Integer getDni() {
        return dni;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setNameAndLastname(String nameAndLastname) {
        this.nameAndLastname = nameAndLastname;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }



}
