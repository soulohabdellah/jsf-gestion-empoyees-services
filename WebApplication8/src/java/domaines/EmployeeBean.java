package domaines;

import beans.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployeeBean {

    private Employee employee;
    private List<Employee> employees;

    public EmployeeBean() {
        employee = new Employee();
        employees = new ArrayList<>();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void onCreateAction() {
        employees.add(employee);
        employee = new Employee();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
