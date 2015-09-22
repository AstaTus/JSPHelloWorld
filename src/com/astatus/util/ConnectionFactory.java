package com.astatus.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Created by AstaTus on 2015/9/20.
 */
public class ConnectionFactory {
    private static String driver;
    private static String dburl;
    private static String user;
    private static String password;

    private  static final ConnectionFactory factory = new ConnectionFactory();

    static {
        Properties prop = new Properties();
        try{
            InputStream in = ConnectionFactory.class.getClassLoader().
                    getResourceAsStream("dbconfig.properties");
            prop.load(in);
        }catch (Exception e){
            e.printStackTrace();
        }

        driver = prop.getProperty("driver");
        dburl = prop.getProperty("dburl");
        user = prop.getProperty("user");
        password = prop.getProperty("password");

    }

    public static ConnectionFactory getInstance(){
        return  factory;
    }

    public Connection makeConnection(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
        }catch (Exception e){
            e.printStackTrace();
        }

        return  conn;
    }
}
