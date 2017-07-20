package com.twins.store.common.pojo;

import com.twins.store.common.base.BasePojo;

import javax.persistence.Column;

/**
 * Created by takesi on 2017/07/20.
 */
public class User extends BasePojo {

    @Column(length = 20, unique = true, nullable = false)
    private String username;

    @Column(length = 45, nullable = false)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
