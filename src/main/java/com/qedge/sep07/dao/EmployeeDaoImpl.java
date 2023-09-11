package com.qedge.sep07.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.qedge.sep07.model.Employee;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao{
	
	private final String INSERT = "insert into employee value(?,?,?,?)";
	@Override
	public void saveEmployee(Employee emp) {
	
		getJdbcTemplate().update(INSERT,new Object[] {emp.getEmpId(),emp.getName(),emp.getSalary(),emp.getAddress()});
	}
}