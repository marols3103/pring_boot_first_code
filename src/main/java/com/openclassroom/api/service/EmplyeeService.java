package com.openclassroom.api.service;
import java.util.Optional;
import com.openclassroom.api.model.Employee;
import com.openclassroom.api.repository.EmpoyeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class EmplyeeService {
    @Autowired
    private EmpoyeeRepository  employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);

    }
    public Iterable<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee){
        Employee saveEmployee = employeeRepository.save(employee);
        return saveEmployee;
    }
}
