package org.kainos.ea.db;


import org.kainos.ea.cli.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO{


    private DatabaseConnector databaseConnector = new DatabaseConnector();

    public List<Employee> getAllEmployees() throws SQLException {
        Connection c = databaseConnector.getConnection();

        Statement st = c.createStatement();


        ResultSet rs = st.executeQuery("SELECT EmployeeID, Name, Salary, BankAccount, NationalInsurance  FROM Employee;");
        List<Employee> employeeList = new ArrayList<>();

        while (rs.next()) {
            Employee employee = new Employee(
                    rs.getInt("EmployeeID"),
                    rs.getString("Name"),
                    rs.getDouble("Salary"),
                    rs.getString("BankAccount"),
                    rs.getString("NationalInsurance")
            );
            employeeList.add(employee);
        }

        return employeeList;
    }

    //creating an employee
    public int createEmployee(Employee employee) throws SQLException {
        Connection c = databaseConnector.getConnection();

        String insertStatement = "INSERT INTO Employee (Name, Salary, BankAccount, NationalInsurance) VALUES (?, ?, ?, ?)";
        PreparedStatement st = c.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);

        st.setString(1, employee.getName());
        st.setDouble(2, employee.getSalary());
        st.setString(3, employee.getBankAccount());
        st.setString(4, employee.getNationalInsurance());

        st.executeUpdate();

        ResultSet rs = st.getGeneratedKeys();

        if (rs.next()) {
            return rs.getInt(1);
        }
        return -1;
    }

//update employee based on id

    public void updateEmployee (int id, Employee employee) throws SQLException{

        Connection c = databaseConnector.getConnection();

        String updateStatement = "UPDATE Employee SET Name = ?, Salary = ?, BankAccount = ?, NationalInsurance = ? WHERE EmployeeID = ? ;";
        PreparedStatement st = c.prepareStatement(updateStatement);

        st.setString(1, employee.getName());
        st.setDouble(2,employee.getSalary());
        st.setString(3, employee.getBankAccount());
        st.setString(4,employee.getNationalInsurance());


        st.executeUpdate();

    }
    //delete employee
    public void deleteEmployee(int id) throws SQLException {

        Connection c = databaseConnector.getConnection();

        String deleteStatement = "DELETE FROM Employee WHERE EmployeeID = ?";

        PreparedStatement st = c.prepareStatement(deleteStatement);

        st.setInt(1, id);
        st.executeUpdate();

    }
}