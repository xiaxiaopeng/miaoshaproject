package com.miaoshaproject.controller.viewobject;

/**
 * @author hongjun500
 * @date 2019/1/31 21:01
 */
public class UserVO {

    private Integer id;            //用户id
    private String name;           //用户名
    private Byte gender;           //性别
    private Integer age;            //年龄
    private String telphone;       //手机号

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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }
}
