package com.techprimers.springbatchexample1.batch;

import com.techprimers.springbatchexample1.model.Employee;
//import com.techprimers.springbatchexample1.model.User;
import com.techprimers.springbatchexample1.repository.EmployeeRepository;
//import com.techprimers.springbatchexample1.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
//public class DBWriter implements ItemWriter<User> {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public void write(List<? extends User> users) throws Exception {
//
//        System.out.println("Data Saved for Users: " + users);
//        userRepository.save(users);
//    }
//}

@Component
public class DBWriter implements ItemWriter<Employee> {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void write(List<? extends Employee> Employees) throws Exception {

        System.out.println("Data Saved for Employees: " + Employees);
        employeeRepository.save(Employees);
    }
}
