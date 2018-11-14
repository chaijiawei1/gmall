package com.dzgrain.gmall.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

//实现序列化：是把对象的字节序列永久地保存到硬盘上，在网络上传送对象的字节序列
//因为 UserInfo 会通过dubbo的提供者，发布到注册中心上，在网络上传送
public class UserInfo implements Serializable {
    @Id
    @Column //标记表示所持久化属性所映射表中的字段
    @GeneratedValue(strategy = GenerationType.IDENTITY) //注解存在的意义主要就是为一个实体生成一个唯一标识的主键 (主键自增长)
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;

    //快捷键生成  alt + insert
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLonginName() {
        return loginName;
    }

    public void setLonginName(String longinName) {
        this.loginName = longinName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return passwd;
    }

    public void setPassword(String password) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }
}
