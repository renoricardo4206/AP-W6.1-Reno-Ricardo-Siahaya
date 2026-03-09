public class Employee {
    String name;
    double baseSalary;  // double, bukan int
    
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public double calculateSalary() {  // return double
        return baseSalary;
    }
    
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + calculateSalary());
        System.out.println();
    }
    
    public String getRole() {
        return "Employee";
    }
    
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        
        employees[0] = new Manager("Alya", 500000);
        employees[1] = new Programmer("Budi", 400000);
        employees[2] = new Programmer("Citra", 450000);
        employees[3] = new Intern("Dina", 200000);
        
        double totalPayroll = 0;  // double, bukan int
        
        for (Employee emp : employees) {
            emp.printInfo();
            totalPayroll += emp.calculateSalary();
        }
        
        System.out.println("Total Payroll: " + totalPayroll);
    }
}

class Manager extends Employee {
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + 2000000;
    }
    
    @Override
    public String getRole() {
        return "Manager";
    }
}

class Programmer extends Employee {
    public Programmer(String name, double baseSalary) {
        super(name, baseSalary);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + 1000000;
    }
    
    @Override
    public String getRole() {
        return "Programmer";
    }
}

class Intern extends Employee {
    public Intern(String name, double baseSalary) {
        super(name, baseSalary);
    }
    
    @Override
    public double calculateSalary() {
        return baseSalary + 300000;
    }
    
    @Override
    public String getRole() {
        return "Intern";
    }
}