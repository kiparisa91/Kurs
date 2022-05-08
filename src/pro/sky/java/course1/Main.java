package pro.sky.java.course1;

public class Main {

    public static void getList(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else {
                    System.out.println(employee[i]);
            }
        }
    }

    public static void getFullSalary(Employee[] employee) {
        double sum = 0;
        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
           } else {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату: " + sum + " руб.");
    }

    public static void findMinSalary(Employee[] employee) {
        int index = 0;
        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getSalary() <= employee[index].getSalary())
                index = i;
        }
        System.out.println("Минимальная зарплата: " + employee[index]);
    }

    public static void findMaxSalary(Employee[] employee) {
        int index = 0;
        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getSalary() >= employee[index].getSalary())
                index = i;
        }
        System.out.println("Максимальная зарплата: " + employee[index]);
    }

    public static void findAverageSalary(Employee[] employee) {
        double sum = 0;
        int index = 0;
        double average;
        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else {
                sum = sum + employee[i].getSalary();
                index = i+1;
            }
        }
        average = sum/index;
        System.out.println("Средняя зарплата: " + average + " руб.");
    }

    public static void getFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else {
                System.out.println(employee[i].getSurname() + " " + employee[i].getName());
            }
        }
    }

    public static void changeSalary(Employee[] employee, double percent) {
        double salary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else {
                salary = employee[i].getSalary() * (1+(percent/100));
                employee[i].setSalary(salary);
                System.out.println(employee[i]);
            }
        }
    }

    public static void findMinSalaryDepartment(Employee[] employee, int department) {
        int index = 0;
        double min = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getDepartment() == department) {
                min = employee[i].getSalary();
                break;
            }
        }
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] == null) {
                break;
            } else if (employee[j].getDepartment() == department && employee[j].getSalary() <= min) {
                index = j;
            }
        }
            System.out.println("Минимальная зарплата данного отдела: " + employee[index]);
    }

    public static void findMaxSalaryDepartment(Employee[] employee, int department) {
        int index = 0;
        double max = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getDepartment() == department) {
                max = employee[i].getSalary();
                break;
            }
        }
        for (int j = 0; j < employee.length; j++) {
            if (employee[j] == null) {
                break;
            } else if (employee[j].getDepartment() == department && employee[j].getSalary() >= max) {
                index = j;
            }
        }
        System.out.println("Максимальная зарплата данного отдела: " + employee[index]);
    }

    public static void getFullSalaryDepartment(Employee[] employee, int department) {
        double sum = 0;

        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getDepartment() == department) {
                sum = sum + employee[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплату по отделу: " + sum + " руб.");
    }

    public static void findAverageSalaryDepartment(Employee[] employee, int department) {
        double sum = 0;
        int index = 0;
        double average;
        for (int i=0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getDepartment() == department) {
                sum = sum + employee[i].getSalary();
                index = index+1;
            }
        }
        average = sum/index;
        System.out.println("Средняя зарплата по отделу: " + average + " руб.");
    }

    public static void changeSalaryDepartment(Employee[] employee, int department, double percent) {
        double salary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else if (employee[i].getDepartment() == department) {
                salary = employee[i].getSalary() * (1+(percent/100));
                employee[i].setSalary(salary);
                System.out.println(employee[i]);
            }
        }
    }

    public static void getEmployee(Employee[] employee, int department) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else if (employee[i].getDepartment() == department) {
                System.out.println(employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getSalary());
            }
        }
    }

    public static void getEmployeeLessSalary(Employee[] employee, double count) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }  else if (employee[i].getSalary() < count) {
                System.out.println(employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getSalary());
            }
        }
    }

    public static void getEmployeeMoreSalary(Employee[] employee, double count) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            } else if (employee[i].getSalary() >= count) {
                System.out.println(employee[i].getId() + " " + employee[i].getSurname() + " " + employee[i].getName() + " " + employee[i].getSalary());
            }
        }
    }


    public static void main(String[] args) {
	// write your code here
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(Employee.count, "Александр", "Сергеев", 2,140000);
        employee[1] = new Employee(Employee.count, "Дмитрий", "Любавин", 4, 150000);
        employee[2] = new Employee(Employee.count, "Алексей", "Герасимов", 3, 120000);
        employee[3] = new Employee(Employee.count, "Вадим", "Салкин", 5, 180000);
        employee[4] = new Employee(Employee.count, "Иван", "Иванов", 1, 200000);
        getList(employee);
        employee[0].setDepartment(5);
        System.out.println("Изменение отдела: " + employee[0]);
        employee[4].setSalary(250000);
        System.out.println("Изменение зарплаты: " + employee[4]);
        getFullSalary(employee);
        findMinSalary(employee);
        findMaxSalary(employee);
        findAverageSalary(employee);
        getFullName(employee);
        changeSalary(employee, 20);
        findMinSalaryDepartment(employee, 5);
        findMaxSalaryDepartment(employee, 5);
        getFullSalaryDepartment(employee, 5);
        findAverageSalaryDepartment(employee,5);
        System.out.println("Индексация зарплаты данного отдела:");
        changeSalaryDepartment(employee, 5, 20);
        System.out.println("Сотрудники отдела:");
        getEmployee(employee, 3);
        System.out.println("Зарплата меньше числа:");
        getEmployeeLessSalary(employee, 150000);
        System.out.println("Зарплата больше числа:");
        getEmployeeMoreSalary(employee, 150000);


    }
}
