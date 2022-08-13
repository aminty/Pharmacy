package org.example.repository;

import org.example.base.repository.BaseRepository;
import org.example.entity.Employee;

public interface EmployeeRepository extends BaseRepository<Employee,Long> {

    boolean isEmployeeExists(Employee employee);

    Employee findEmployeeByUsername(String username);

    double getAllPatientCashById(long id);



}
