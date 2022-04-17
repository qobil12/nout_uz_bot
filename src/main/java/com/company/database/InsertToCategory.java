package com.company.database;
// PROJECT NAME shop_bot
// TIME 17:18
// MONTH 04
// DAY 12

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertToCategory {
    public static Scanner SCANNER_STR = new Scanner(System.in);
    public static Scanner SCANNER_NUM = new Scanner(System.in);

    public static void main(String args[]) {
        Connection connection = DBConnection.getConnection();
        try {

            System.out.println("Enter the name of the Category : ");
            String name = SCANNER_STR.nextLine();

            String query = " INSERT INTO category(name) \n " +
                    " VALUES(?);";

            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,name);


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
