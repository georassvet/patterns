package creational.builder.ex1;

public class ManEmployeeBuilder extends EmployeeBuilder {
    void chooseGender() {
        employee.setSex(Gender.Man);
    }

    void addName(String name) {
        employee.setName(name);
    }

    void setSalary(double salary) {
        employee.setSalary(salary);
    }
}
