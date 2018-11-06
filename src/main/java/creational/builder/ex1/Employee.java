package creational.builder.ex1;

public class Employee {
    private String name;
    private double salary;
    private Gender sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", sex=" + sex +
                '}';
    }
}
