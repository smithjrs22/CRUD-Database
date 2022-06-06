package netjavaguides.springbootthymeleafcrudwebapp.repository;

import netjavaguides.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
