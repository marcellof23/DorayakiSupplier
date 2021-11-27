package com.dorayakisupplier.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
    private Connection connection;
    private static DBConfig serviceDB = new DBConfig();

    public DBConfig(){
        try{
            String DB_URL = "jdbc:mysql://localhost/pabrik_dorayaki?useLegacyDatetimeCode=false&serverTimezone=UTC";
            String DB_USERNAME = "root";
            String DB_PASSWORD = "bodoamat";
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection Success");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return this.connection;
    }

    public static DBConfig getDbService(){
        return DBConfig.serviceDB;
    }

}
