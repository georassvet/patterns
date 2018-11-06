package creational.builder.ex1;

public class EmpTestDrive {
    public static void main(String[] args) {
        Director dir = new Director();
        dir.setBuilder(new WomanEmployeeBuilder());
        Employee employee = dir.buildEmployee("BabySister", 25000);
        System.out.println(employee);
    }
}
