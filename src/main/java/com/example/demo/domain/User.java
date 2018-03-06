package com.example.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Override
//    public String toString() {
//        return "name="+this.name+",age="+this.age+",pass="+this.pass;
//    }

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = false)
    private String userName;
    @Column(nullable = false)
    private String passWord;
    @Column(nullable = false, unique = false)
    private String email;
    @Column(nullable = true, unique = false)
    private String nickName;
    @Column(nullable = false)
    private String regTime;
    @Column(nullable = false, unique = false)
    private int age;

    public  User(){}
    public User(String userName, String email, String nickName, String passWord, String regTime,int age) {
        this.userName=userName;
        this.email=email;
        this.nickName=nickName;
        this.passWord=passWord;
        this.regTime=regTime;
        this.age=age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
