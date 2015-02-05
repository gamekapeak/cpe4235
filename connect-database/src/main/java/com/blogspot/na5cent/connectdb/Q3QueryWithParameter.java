/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.connectdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anonymous
 */
public class Q3QueryWithParameter {

    private static final int EMPLOYEE_ID = 100;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(C3DBConfig.getDriver());

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(
                    C3DBConfig.getUrl(),
                    C3DBConfig.getUsername(),
                    C3DBConfig.getPassword()
            );

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Employees WHERE employee_id = " + EMPLOYEE_ID);
            while (resultSet.next()) {
                System.out.println("employee_id = " + resultSet.getInt("employee_id"));
                System.out.println("first_name = " + resultSet.getString("first_name"));
                System.out.println("last_name = " + resultSet.getString("last_name"));
                System.out.println("email = " + resultSet.getString("email"));
                System.out.println("------------------------------------------");
            }
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        }
    }
}
