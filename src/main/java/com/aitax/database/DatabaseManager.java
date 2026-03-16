package com.aitax.database;

import java.sql.*;

import com.aitax.model.User;

public class DatabaseManager {

    Connection con;

    public DatabaseManager() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/taxdb",
                "root",
                "your_password_here");

            System.out.println("Database connected successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found. Add mysql-connector-j to pom.xml.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }

    public void saveUser(User user, double tax) {

        if (con == null) {
            System.out.println("Skipping DB save — no connection.");
            return;
        }

        try {
            String query = "INSERT INTO users(name, income, deductions, tax) VALUES(?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, user.getName());
            ps.setDouble(2, user.getIncome());
            ps.setDouble(3, user.getDeductions());
            ps.setDouble(4, tax);

            ps.executeUpdate();
            System.out.println("User saved to database successfully.");

        } catch (SQLException e) {
            System.out.println("Failed to save user to database.");
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}