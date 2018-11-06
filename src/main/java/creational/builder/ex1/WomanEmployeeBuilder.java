package creational.builder.ex1;

public class WomanEmployeeBuilder extends EmployeeBuilder {
    void chooseGender() {
        employee.setSex(Gender.Woman);
    }

    void addName(String name) {
        employee.setName(name);
    }

    void setSalary(double salary) {
        employee.setSalary(salary);
    }
}
