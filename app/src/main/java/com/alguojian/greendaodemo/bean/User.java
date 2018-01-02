package com.alguojian.greendaodemo.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 用户
 *
 * @author ALguojian
 * @date 2018/1/2
 */

@Entity
public class User {

    public static final int TYPE_AGE = 4;

    @Id(autoincrement = true)//不能用int,表的ID,并且设置自增长
    private Long id;

    @Unique //唯一值
    private String name;

    @NotNull//不能为空
    private String six;


    private int age;
    private boolean study;
    @Generated(hash = 596902004)
    public User(Long id, String name, @NotNull String six, int age, boolean study) {
        this.id = id;
        this.name = name;
        this.six = six;
        this.age = age;
        this.study = study;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSix() {
        return this.six;
    }
    public void setSix(String six) {
        this.six = six;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean getStudy() {
        return this.study;
    }
    public void setStudy(boolean study) {
        this.study = study;
    }



}
