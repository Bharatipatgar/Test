public class EmployeeManagement {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        employee1.employeeId = "E001";
        employee1.role = "Manager";
        employee1.salary = 75000.00;
        employee1.isOnDuty = true;

        System.out.println("Employee ID: " + employee1.employeeId);
        System.out.println("Role: " + employee1.role);
        System.out.println("Salary: " + employee1.salary);
        System.out.println("On Duty: " + employee1.isOnDuty);

        System.out.println("------------------------------------");

        Employee employee2 = new Employee();
        employee2.employeeId = "E002";
        employee2.role = "Cashier";
        employee2.salary = 45000.00;
        employee2.isOnDuty = false;

        System.out.println("Employee ID: " + employee2.employeeId);
        System.out.println("Role: " + employee2.role);
        System.out.println("Salary: " + employee2.salary);
        System.out.println("On Duty: " + employee2.isOnDuty);

        System.out.println("------------------------------------");

        Employee employee3 = new Employee();
        employee3.employeeId = "E003";
        employee3.role = "Sales Executive";
        employee3.salary = 50000.00;
        employee3.isOnDuty = true;

        System.out.println("Employee ID: " + employee3.employeeId);
        System.out.println("Role: " + employee3.role);
        System.out.println("Salary: " + employee3.salary);
        System.out.println("On Duty: " + employee3.isOnDuty);

        System.out.println("------------------------------------");

        }
}