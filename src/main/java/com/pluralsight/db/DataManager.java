package com.pluralsight.db;

import com.pluralsight.model.Shipper;

import javax.sql.DataSource;
import java.security.cert.CertificateRevokedException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<Shipper> getAllShippers(){
        List<Shipper> shippers = new ArrayList<>();
        String shipperQuery = "SELECT * FROM northwind.shippers";

        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(shipperQuery);
            ResultSet resultSet = preparedStatement.executeQuery()) {

            if(resultSet.next()){
                do{
                    int shipperID = resultSet.getInt(1);
                    String companyName = resultSet.getString(2);
                    String phone = resultSet.getString(3);

                    shippers.add(new Shipper(shipperID, companyName,phone));
                } while (resultSet.next());
            } else {
                System.out.println("No shippers");
            }

        }catch (Exception e){
            System.err.println("There's an error.");
            e.printStackTrace();
        }

        return shippers;
    }


}
