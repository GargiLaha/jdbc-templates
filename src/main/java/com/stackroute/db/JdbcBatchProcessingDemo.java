//package com.stackroute.db;
//
//import java.sql.*;
//
//public class JdbcBatchProcessingDemo {
//  private Connection conn;
//  public void jdbcBatch(){
//    try {
//
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/customerdb",
//        "root","Root@123");
//     Statement stmt = conn.createStatement();
//      conn.setAutoCommit(false);
//      //set auto-commit to false
//      conn.setAutoCommit(false);
//
//      // Create SQL statement
//      String SQL1 = "INSERT INTO customer(name, age, gender ) " +
//        "VALUES(lakshmi, 2, female )";
//// Add above SQL statement in the batch.
//      stmt.addBatch(SQL1);
//
////      // Create one more SQL statement
//    String SQL2 = "INSERT INTO customer (name, age, gender) " +
//       "VALUES(guddu, 35 , female)";
////// Add above SQL statement in the batch.
//     stmt.addBatch(SQL2);
//
//      // Create one more SQL statement
//      String SQL3 = "UPDATE customer SET age = 35 " +
//        "WHERE id = 1";
//// Add above SQL statement in the batch.
//      stmt.addBatch(SQL3);
//
//      // Create an int[] to hold returned values
//    int[] count = stmt.executeBatch();
//
////Explicitly commit statements to apply changes
//      conn.commit();
//
//
//
//      Statement smt = conn.createStatement();
//      ResultSet rs = smt.executeQuery("select * from customer");
//
//      while(rs.next())
//
//        System.out.println(rs.getInt(1) +" " +rs.getString(2)+ " " +rs.getInt(3)+" "+rs.getString(4));
//    } catch (SQLException | ClassNotFoundException e) {
//      e.printStackTrace(); }
//  }
//}



package com.stackroute.db;
import java.sql.*;
import java.io.*;
public class JdbcBatchProcessingDemo {
  public void display(){
    try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con= DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/customerdb","root","Root@123");
      PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?)");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      while(true){

        System.out.println("enter id");
        String s1=br.readLine();
        int id=Integer.parseInt(s1);
        System.out.println("enter name");
        String name=br.readLine();
        System.out.println("enter age");
        String s2=br.readLine();
        int age=Integer.parseInt(s2);
        System.out.println("enter gender");
        String gender=br.readLine();

        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,age);
        ps.setString(4,gender);
        ps.addBatch();
        System.out.println("Want to add more records? /n enter yes or no");
        String choice=br.readLine();
        if(choice.equals("no")){
          break;
        }
      }
      ps.executeBatch();
      System.out.println("record successfully saved!     ;)");
      con.close();
    }catch(Exception e){System.out.println(e);}
  }
}
