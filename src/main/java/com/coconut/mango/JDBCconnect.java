package com.coconut.mango;

import java.sql.*;
import java.time.LocalDate;

public class JDBCconnect {

    Statement statement;
    public JDBCconnect() {
        String url = "jdbc:mysql://localhost:3306/mango-db";
        String username="root";
        String password="";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,password);

            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("select COUNT(*) from memory");


//            String insertSQL = "INSERT INTO memory(id,type,in1,in2)" + "VALUES(00002,'reverseString','hello world reverse this!','')";
//            statement.executeUpdate(insertSQL);


//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
//            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void insertInfo(String type, String in1){

        String date = LocalDate.now().toString();
        String insertSQL = "INSERT into memory VALUES('" + date + "','"+ type + "','"+ in1 + "','')" ;

        try {
            statement.executeUpdate(insertSQL);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
