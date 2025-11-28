interface Payable {
    double calculateSalary(Employee employee);
    double calculateSalary(Employee employee, double bonusRate);
}

class Person {
    private String id;
    private String name;
    private String gender;
    private int age;

    public Person(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public int getAge() { return age; }

    public String getInfo() {
        return name + " (" + gender + ", " + age + ")";
    }
}

class Employee extends Person {
    protected String role;

    public Employee(String id, String name, String gender, int age, String role) {
        super(id, name, gender, age);
        this.role = role;
    }

    public String getRole() { return role; }

    public String getEmployeeInfo() {
        return getInfo() + " | Role: " + role;
    }
}

class Accounting extends Employee implements Payable {

    public Accounting(String id, String name, String gender, int age) {
        super(id, name, gender, age, "Accounting");
    }

    private boolean hasAccess() {
        return getId().equals("A001");
    }

    @Override
    public double calculateSalary(Employee e) {
        if (!hasAccess()) return 0;

        switch (e.getRole()) {
            case "Staff": return 5000;
            case "Manager": return 7000;
            default: return 0;
        }
    }

    @Override
    public double calculateSalary(Employee e, double bonusRate) {
        double base = calculateSalary(e);
        return base + (base * bonusRate);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        if (hasAccess()) {
            info += " | Can calculate salaries for Staff & Manager";
        }
        return info;
    }
}