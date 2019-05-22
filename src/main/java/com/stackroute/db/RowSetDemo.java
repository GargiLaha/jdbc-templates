//package com.stackroute.db;
//
//import com.sun.rowset.CachedRowSetImpl;
//import com.sun.rowset.JdbcRowSetImpl;
//
//import javax.sql.rowset.CachedRowSet;
//import javax.sql.rowset.JdbcRowSet;
//import java.sql.Connection;
//import java.sql.*;
//
//public class RowSetDemo {
//

  //demo of connected rowset



//  public void displayData() {
//    try {
//      //Resister Driver with driver manager service
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      System.out.println("Driver loaded");//create connection
//
//      JdbcRowSet jrs = new JdbcRowSetImpl();
//      jrs.setUrl("jdbc:mysql://localhost:3306/customerdb"); // set method to connect to datasource (configure)
//      jrs.setUsername("root");
//      jrs.setPassword("Root@123");
//      System.out.println("got connected");
//      jrs.setCommand("SELECT * FROM customer where name=? ");
//      jrs.setString(1, "name"); // set method to pass input parameter
//      jrs.execute(); // fills this rowset object with data
//      while(jrs.previous())
//        System.out.println(jrs.getInt(1)+"  "+jrs.getString(2)+ " "+jrs.getInt(3)+ " "+ jrs.getString(4));
//    } catch (Exception e)
//    { System.out.println(e); }
//    finally {
//      try {
//        con.close();
//      } catch (SQLException e) {
//        e.printStackTrace();
//      }
//    }
//    }
//


