package com.example.springboot_rest.dao;

import com.example.springboot_rest.entity.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO{

    //@Autowired(required = true)
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> employeesList = query.getResultList();

        return employeesList;

    }
}
