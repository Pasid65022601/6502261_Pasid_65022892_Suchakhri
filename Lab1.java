class Lab1 {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 40, 123, 50000, "IT");
        Programmer programmer = new Programmer("Jane Smith", 30, 456, 40000, "Java");
        Security security = new Security("Adam Jones", 45, 789, 18000, "Night");

        manager.displayDetails();
        manager.work();
        manager.CallMeeting();

        programmer.displayDetails();
        programmer.work();
        programmer.Coding();

        security.displayDetails();
        security.work();
        security.Patrol();
    }
}

class Employee {
    String name;
    int age;
    int employeeId;
    double salary;

    public Employee(String name, int age, int employeeId, double salary) {
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, int employeeId, double salary, String department) {
        super(name, age, employeeId, salary);
        this.department = department;
    }

    public void CallMeeting() {
        System.out.println(name + " is scheduling a meeting.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Programmer extends Employee {
    String language;

    public Programmer(String name, int age, int employeeId, double salary, String language) {
        super(name, age, employeeId, salary);
        this.language = language;
    }

    public void Coding() {
        System.out.println(name + " is coding.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + language);
    }
}

class Security extends Employee {
    String shift;

    public Security(String name, int age, int employeeId, double salary, String shift) {
        super(name, age, employeeId, salary);
        this.shift = shift;
    }

    public void Patrol() {
        System.out.println(name + " is patrolling.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Available at " + shift + " Shift");
    }
}