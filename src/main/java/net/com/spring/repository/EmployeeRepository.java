/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.com.spring.model.Employee;

/**
 * JpaRepository<T, ID> extends CrudRepository
 * T: Domain type that repository manages (Generally the Entity/Model class name)
 * ID: Type of the id of the entity that repository manages (Generally the wrapper class
 * of your @Id that is created inside the Entity/Model class)
 * 
 * @Component  – Sử dụng để định nghĩa một khuôn mẫu chung cho toàn bộ dự án. Các bean
 *             được
 *             tạo ra trong class được đánh dấu với @Component thường sẽ được dùng chung
 *             cho toàn bộ dự án hoặc cho một profile cụ thể.
 * 
 * @Service    – Dùng để đánh dấu Class là tầng Service, phục vụ các logic nghiệp vụ.
 * 
 * @Repository - Đánh dấu một Class Là tầng Repository, phục vụ truy xuất dữ liệu.
 * 
 * @author     falcon
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
