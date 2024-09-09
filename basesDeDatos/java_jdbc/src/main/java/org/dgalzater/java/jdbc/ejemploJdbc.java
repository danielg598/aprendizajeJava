package org.dgalzater.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ejemploJdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306";

        Connection conn = DriverManager.getConnection();
    }
}
