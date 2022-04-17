package com.company.database;
// PROJECT NAME shop_bot
// TIME 17:18
// MONTH 04
// DAY 12

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertToProduct {
    public static Scanner SCANNER_STR = new Scanner(System.in);
    public static Scanner SCANNER_NUM = new Scanner(System.in);

    public static void main(String args[]) {
        Connection connection = DBConnection.getConnection();
        try {

            System.out.println("Enter the name of the Product :");
            String name = SCANNER_STR.nextLine();

            System.out.println("Enter the price of the product :");
            int price = SCANNER_NUM.nextInt();

            String query = " INSERT INTO product(name,price,brand_id,category_id) \n " +
                    " VALUES(?,?);";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);
            statement.setInt(2,price);

            int executeUpdate = statement.executeUpdate();
            System.out.println("executeUpdate = " + executeUpdate);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

}
