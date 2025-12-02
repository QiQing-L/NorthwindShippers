package com.pluralsight;

import com.pluralsight.db.DataManager;
import com.pluralsight.model.Shipper;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("User and Password are needed!");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);

        DataManager dataManager = new DataManager(northwindDataSource);

        Scanner scanner = new Scanner(System.in);

        /* 1. Prompt the user for new shipper data (name and phone) and then insert it
           into the shippers table.  Display the new shipper id when the insert is complete. */

        // 2. Run a query and display all of the shippers
        List<Shipper> shipperList = dataManager.getAllShippers();
        shipperList.forEach(System.out::println);

        /* 3. Prompt the user to change the phone number of a shipper.  They should
        enter the id and the phone number. */


        // 4. Run a query and display all of the shippers

        /* 5. Prompt the user to delete a shipper.   DO NOT ENTER SHIPPERS 1-3.
              They have related data in other tables.  Delete your new shipper. */

       // 6. Run a query and display all of the shippers


    }
}
