//package com.stackroute.db;
//
//import java.sql.*;
//
//public class CrudOperation {
//private Connection con;
//private Statement stmt;
//   private ResultSet rs;
//
//    public void displayData() {
//        try (Connection con= DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
//             Statement stmt=con.createStatement();
//             ResultSet rs=stmt.executeQuery("select * from customer"))
//            {
//            //Resister Driver with driver manager service
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");//create connection
//            //here db1 is database name, root is username and root123 is password
//
//            //create statement object
//            System.out.println("got connected");
//            //process result
//            //rs.last();
//            rs.afterLast();
//            //rs.absolute(3);
//            while(rs.previous())
//                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+ " "+rs.getInt(3)+ " "+ rs.getString(4));
//
//        }catch(Exception e){ System.out.println(e);}
//        finally {
////            try {
////             con.close();
////                stmt.close();
////            } catch (SQLException e) {
////                e.printStackTrace();
////            }
//        }
//    }
//
//    public void displayCustomrerByName(String name, String gender) {
//
//        try{
//            //Resister Driver with driver manager service
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver loaded");//create connection
//            //here db1 is database name, root is username and root123 is password
//            con= DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
//            //create statement object
//            System.out.println("got connected");
//
//            PreparedStatement stmt=con.prepareStatement("Select * from customer where name = ? and gender =? ");
//          //  stmt.setInt(1,3);
//            stmt.setString(1,name);
//            stmt.setString(2, gender);
//            ResultSet rs = stmt.executeQuery();
//            //execute query
//          //  ResultSet rs=stmt.executeQuery("select * from customers");
//            //process result
//            while(rs.next())
//                System.out.println("ID "+rs.getInt(1)+"  "+rs.getString(2)+" "+ rs.getString(3));
//            con.close();
//        }catch(Exception e){ System.out.println(e);}
//        finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void insertCustomer(int id, String name) {
//
//        //PreparedStatement
//    }
//    }
