package com.laoliu.domain.dto;

import java.io.Serializable;

/**
 * @author zhengliu
 * @createTime 2018/11/12
 */
public class User implements Serializable{
    private Integer id;
    private String name;
    private String password;
    private Long created;
    private Long updated;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }
}
