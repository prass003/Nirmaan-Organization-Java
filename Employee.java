package task;

public class Employee {
    String name;
    String phoneNum;
    double salary;
    int rollNum;
    public void setEmployeeDetails(String name, String phoneNum, double salary, int rollNum) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.salary = salary;
        this.rollNum = rollNum;
    }

    public String getEmployeeDetails() {
        return "Employee Details:\n" +"Name: " + name + "\n" +"Phone Number: " + phoneNum + "\n" + "Salary: " + salary + "\n" +
               "Roll Number: " + rollNum;
    }

    public void displayEmployeeInfo() {
        System.out.println(getEmployeeDetails());
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeDetails("John Doe", "9876543210", 50000, 101);
        emp.displayEmployeeInfo();
    }
}
