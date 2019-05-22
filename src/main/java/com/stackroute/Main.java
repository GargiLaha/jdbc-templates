package com.stackroute;

//import com.stackroute.db.CrudOperation;
import com.stackroute.db.JdbcBatchProcessingDemo;
import com.stackroute.db.ResultsetMetadataDemo;
//import com.stackroute.db.RowSetDemo;

public class Main {
    public static void main(String[] args) {
//        CrudOperation crudOperation = new CrudOperation();
//       crudOperation.displayData();
//     //   crudOperation.displayCustomrerByName("gargi", "female");


     // rowset call
       //RowSetDemo rowSetDemo = new RowSetDemo();
       //rowSetDemo.displayData();



     //jdbcBatchProcesingDemo call
//        JdbcBatchProcessingDemo jdbcBatchProcessingDemo= new JdbcBatchProcessingDemo();
//        jdbcBatchProcessingDemo.display();

     //ResultsetMetadataDemo call
        ResultsetMetadataDemo resultsetMetadataDemo=new ResultsetMetadataDemo();
        resultsetMetadataDemo.display();
    }
}
