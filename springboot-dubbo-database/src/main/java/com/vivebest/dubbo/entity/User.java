package com.vivebest.dubbo.entity;



import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import tk.mybatis.mapper.annotation.ColumnType;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1879197482104259255L;
    @Id
    @GeneratedValue
    private String id;
    @ColumnType(column = "name")
    private String username;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
