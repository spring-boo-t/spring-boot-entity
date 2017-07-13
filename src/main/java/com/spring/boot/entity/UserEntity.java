/**
 * Copyright (c) Windliven 2016 All Rights Reserved
 *
 * @author liyj
 * @date 2017年7月11日 下午2:34:32
 * @since V1.0.0
 */
package com.spring.boot.entity;

/**
 * TODO
 *
 * @author liyj
 * @date 2017年7月11日 下午2:34:32
 *
 */
public class UserEntity {
    /**
     * id
     */
    private String id;
    /**
     * name
     */
    private String name;
    /**
     * pass
     */
    private String pass;
    /**
     * email
     */
    private String email;
    /**
     * iphone
     */
    private String iphone;
    public UserEntity() {}
    public UserEntity(String id) {this.id = id;}
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIphone() {
        return iphone;
    }
    public void setIphone(String iphone) {
        this.iphone = iphone;
    }
    
}
