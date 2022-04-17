package com.company.database;
// PROJECT NAME shop_bot
// TIME 17:05
// MONTH 04
// DAY 12

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Class.forName("org.postgresql.Driver");  // 1

            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/nout_uz",
                            "postgres", "Bahodir2011"); //2

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;

    }

}
