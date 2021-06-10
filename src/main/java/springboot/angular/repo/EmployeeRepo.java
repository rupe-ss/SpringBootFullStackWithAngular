package springboot.angular.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.angular.domain.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
