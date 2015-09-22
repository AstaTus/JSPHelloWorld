package com.astatus.entity;

import java.io.Serializable;

/**
 * Created by AstaTus on 2015/9/18.
 */
public class UserEntity implements Serializable{
    public UserEntity() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;
    private String password;
}
