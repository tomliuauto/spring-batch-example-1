package com.techprimers.springbatchexample1.batch;

import com.techprimers.springbatchexample1.model.Employee;
//import com.techprimers.springbatchexample1.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//@Component
//public class Processor implements ItemProcessor<User, User> {

@Component
public class Processor implements ItemProcessor<Employee, Employee> {

    private static final Map<String, String> DEPT_NAMES =
            new HashMap<>();

    public Processor() {
        DEPT_NAMES.put("001", "Technology");
        DEPT_NAMES.put("002", "Operations");
        DEPT_NAMES.put("003", "Accounts");
    }

//    @Override
//    public User process(User user) throws Exception {
//        String deptCode = user.getDept();
//        String dept = DEPT_NAMES.get(deptCode);
//        user.setDept(dept);
//        user.setTime(new Date());
//        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
//        return user;
//    }

    @Override
    public Employee process(Employee employee) throws Exception {
        String deptCode = employee.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        employee.setDept(dept);
        employee.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return employee;
    }
}
