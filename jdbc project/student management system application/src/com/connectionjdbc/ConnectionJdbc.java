package com.connectionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionJdbc {
     static Connection conn;
    public static Connection createConn(){

        try {
            // loading driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // start the connection..
            String user ="root";
            String password = "password";
            String url = "jdbc:mysql://localhost:3306/Student_Management_System_Application";

            // create connection
            conn = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
