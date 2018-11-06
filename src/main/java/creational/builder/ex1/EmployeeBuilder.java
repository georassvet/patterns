package creational.builder.ex1;

public abstract class EmployeeBuilder {

    Employee employee;

    public void createEmployee(){
        employee = new Employee();

    }

    abstract void chooseGender();
    abstract void addName(String name);
    abstract void setSalary(double salary);

    public Employee getEmployee() {
        return employee;
    }
}
