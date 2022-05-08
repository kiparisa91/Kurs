package pro.sky.java.course1;

public class Employee {
    private String name;
    private String surname;
    private int department;
    private int id;
    static int count = 1;
    private double salary;

    public Employee(int id, String name, String surname, int department, double salary) {
        this.id = count;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public int getCount() {
        return count;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.surname + " Отдел:" + this.department + " Зарплата:" + this.salary + " руб.";
    }



}
