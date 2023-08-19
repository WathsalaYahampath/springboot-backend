package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //all crud database methods
    //apita interface ekk thw interface ekkata implement krnna ba extend krnn ona
}
