package com.astatus.test;

import com.astatus.dao.UserDao;
import com.astatus.dao.impl.UserDaoImpl;
import com.astatus.entity.User;
import com.astatus.util.ConnectionFactory;

import java.sql.Connection;

/**
 * Created by AstaTus on 2015/9/21.
 */
public class UserDaoTest {
    public static void main(String args[]) {
        Connection conn = null;
        try{
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);

            UserDao userDao = new UserDaoImpl();
            User user = new User();
            user.setName("Tom");
            user.setPassword("123456");
            user.setEmail("tom@gmail.com");
            userDao.save(conn, user);
            conn.commit();;
        }catch (Exception e){

        }
    }
}
