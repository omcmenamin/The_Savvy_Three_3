package org.kainos.ea.api;

import org.kainos.ea.cli.Employee;
import org.kainos.ea.client.FailedToGetEmployeeException;
import org.kainos.ea.db.EmployeeDAO;

import java.sql.SQLException;
import java.util.List;

public class EmployeeService {

    private final EmployeeDAO employeeDAO= new EmployeeDAO();

    public List<Employee> getAllOrders() throws FailedToGetEmployeeException {

        List<Employee> employeeList;
        employeeList = null;
        try {
            employeeList = employeeDAO.getAllEmployees();
        } catch (SQLException e) {
            throw new FailedToGetEmployeeException();
        }
        try {
            //Order order = orderList.get(1);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(employeeList);
        return employeeList;
    }
}
