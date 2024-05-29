package out.production.association;

import java.util.List;

public class TestAggregation{

    public static void main(String[] args) {

        Employee e1 = new Employee("John", "1");
        Employee e2 = new Employee("Rebecca", "2");

        Bank b = new Bank("DBS", "SK",List.of(e1,e2));
    }
}

class Bank{
    private String name;
    private String address;
    private List<Employee> employees;

    public Bank(String name, String address, List<Employee> employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}


class Employee{
    private String name;
    private String empId;

    public Employee(String name, String empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
