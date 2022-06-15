package com.coconut.mango;

import java.sql.*;

public class JDBCconnect {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mango-db";
        String username="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from memory");

            String insertSQL = "INSERT INTO memory(id,type,in1,in2)" + "VALUES(00002,'reverseString','hello world reverse this!','')";
            statement.executeUpdate(insertSQL);


//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
