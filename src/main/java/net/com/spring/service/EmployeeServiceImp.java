/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.com.spring.model.Employee;
import net.com.spring.repository.EmployeeRepository;

/**
 * <p>
 * @Service Đánh dấu một Class là tầng Service, phục vụ các logic nghiệp vụ.
 * </p>
 * 
 * <p>
 * @Repository Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.
 * </p>
 * 
 * <p>
 * @Autowired Inject instance of class (object).
 * </p>
 * 
 * <p>
 * @Component Annotation(chú thích) đánh dấu Class is Bean (or dependency).
 * </p>
 * 
 * @author falcon
 */
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() { return employeeRepository.findAll(); }

	@Override
	public void saveEmployee( Employee employee ) { this.employeeRepository.save(employee); }

	@Override
	public Employee getEmployeeById( long id ) {

		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee = null;
		if (optional.isPresent()) {
			employee = optional.get();
		} else throw new RuntimeException("Employy not found for id = " + id);

		return employee;
	}

	@Override
	public void deleteEmployeeById( long id ) { employeeRepository.deleteById(id); }

	@Override
	public Page<Employee> findPaginated( int pageNo, int pageSize, String sortField,
	        String sortDirection ) {

		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())
		        ? Sort.by(sortField).ascending()
		        : Sort.by(sortField).descending();
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.employeeRepository.findAll(pageable);
	}
}
