package service;

import beans.Employee;
import dao.IDAO;
import java.util.List;
import org.hibernate.Session;
import util.HibernateUtil;

public class EmployeeService implements IDAO<Employee> {

    @Override
    public boolean create(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(employee);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(employee);
        session.flush();
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Employee getById(int id) {
        Employee employee = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employee = (Employee) session.get(Employee.class, id);
        session.getTransaction().commit();
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employees = null;

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        employees = session.createQuery("from Employee").list();
        session.getTransaction().commit();
        return employees;
    }

}
