package com.coforge.assignment.erm.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.assignment.erm.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveEmployee(Employee theEmployee) {
		
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theEmployee);
		
		
	}

	@Override
	public List<Employee> getEmployees() {
		

		Session session=sessionFactory.getCurrentSession();
	    //jpa queries-jpql
	   CriteriaBuilder cb=session.getCriteriaBuilder();
	   CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
	   Root<Employee> root=cq.from(Employee.class);
	   cq.select(root);
	   Query query=session.createQuery(cq);
	   return query.getResultList();

		
	}

	@Override
	public Employee getEmployee(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Employee theEmployee=currentSession.get(Employee.class,theId);
		
		return theEmployee;
		
	}

	@Override
	public void deleteEmployee(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Employee e1=currentSession.byId(Employee.class).load(theId);
		currentSession.delete(e1);	
		
	}

}
