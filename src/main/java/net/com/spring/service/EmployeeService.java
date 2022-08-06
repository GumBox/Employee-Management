/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.com.spring.model.Employee;

/**
 *
 * @author falcon
 */
public interface EmployeeService {

	List<Employee> getAllEmployees();

	void saveEmployee( Employee employee );

	Employee getEmployeeById( long id );

	void deleteEmployeeById( long id );

	Page<Employee> findPaginated( int pageNo, int pageSize, String sortField,
	        String sortDirection );

}
