package creational.builder.ex1;

public class Director {
   private EmployeeBuilder builder;

    public void setBuilder(EmployeeBuilder builder) {
        this.builder = builder;
    }

    public Employee buildEmployee(String empName, double salary){
        builder.createEmployee();
        builder.addName(empName);
        builder.setSalary(salary);
        builder.chooseGender();
        return builder.getEmployee();
    }

}
