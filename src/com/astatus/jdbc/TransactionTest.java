package com.astatus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by AstaTus on 2015/9/20.
 */
public class TransactionTest {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "root");
        }catch (Exception e){
            e.printStackTrace();
        }

        return  conn;
    }

    public  static void insertUserData(Connection conn) throws SQLException{
            String sql = "INSERT INTO tbl_user(id, name, password, email)" +
                    "VALUES(10, 'Tom', '123456', 'tom@gmail.com')";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("插入了" + count + "条信息");
    }

    public  static void insertAddressData(Connection conn) throws SQLException{

            String sql = "INSERT INTO tbl_address(id, city, country, user_id)" +
                    "VALUES(1, 'zhejiang', 'China', 10)";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("地址表插入了" + count + "条信息");
    }

    public static void main(String[] args){
        Connection conn = null;
        try{
            conn = getConnection();
            conn.setAutoCommit(false);
            insertUserData(conn);
            insertAddressData(conn);
            conn.commit();
        }catch (SQLException e){
            System.out.println("============补货SQL异常=============");
            e.printStackTrace();
            try{
                conn.rollback();
                System.out.println("============事务回滚成功=============");
            }catch (Exception e2){
                e2.printStackTrace();
            }finally {
                try{
                    if(conn != null){
                        conn.close();
                    }
                }catch (Exception e3){
                    e3.printStackTrace();
                }
            }
        }

    }
}
