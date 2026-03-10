package com.wipro.practice;

import java.sql.*;

public class test {

    public static void main(String[] args) {

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb",
                "root",
                "rps@123"
            );

            
            PreparedStatement ps1 =
                con.prepareStatement("INSERT INTO student VALUES (?, ?)");
            ps1.setInt(1, 1);
            ps1.setString(2, "Keerthana");
            ps1.executeUpdate();

            
            PreparedStatement psSelect =
                con.prepareStatement("SELECT * FROM student");

            ResultSet rs = psSelect.executeQuery();

            System.out.println("Student Table Data:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + "  " + name);
            }

            
            PreparedStatement ps2 =
                con.prepareStatement("UPDATE student SET name=? WHERE id=?");
            ps2.setString(1, "K. Keerthana");
            ps2.setInt(2, 1);
            ps2.executeUpdate();

           
            PreparedStatement ps3 =
                con.prepareStatement("DELETE FROM student WHERE id=?");
            ps3.setInt(1, 1);
            ps3.executeUpdate();

           
            rs.close();
            ps1.close();
            psSelect.close();
            ps2.close();
            ps3.close();
            con.close();

            System.out.println("CRUD operations completed successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

