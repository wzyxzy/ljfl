package com.wzy.ljfl.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "hbkjdx")
public class StudentEntity implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "study_id")
    private Long study_id;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private String sex;
    @Column(name = "id_num")
    private String id_num;
    @Column(name = "birth")
    private String birth;
    @Column(name = "class")
    private String _class;
    @Column(name = "fraction")
    private String fraction;
    @Column(name = "parent_call")
    private String parent_call;
    @Column(name = "middle_school")
    private String middle_school;
    @Column(name = "home_direct")
    private String home_direct;
    @Column(name = "call_num")
    private String call_num;
    @Column(name = "qq_num")
    private String qq_num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudy_id() {
        return study_id;
    }

    public void setStudy_id(Long study_id) {
        this.study_id = study_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId_num() {
        return id_num;
    }

    public void setId_num(String id_num) {
        this.id_num = id_num;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    public String getParent_call() {
        return parent_call;
    }

    public void setParent_call(String parent_call) {
        this.parent_call = parent_call;
    }

    public String getMiddle_school() {
        return middle_school;
    }

    public void setMiddle_school(String middle_school) {
        this.middle_school = middle_school;
    }

    public String getHome_direct() {
        return home_direct;
    }

    public void setHome_direct(String home_direct) {
        this.home_direct = home_direct;
    }

    public String getCall_num() {
        return call_num;
    }

    public void setCall_num(String call_num) {
        this.call_num = call_num;
    }

    public String getQq_num() {
        return qq_num;
    }

    public void setQq_num(String qq_num) {
        this.qq_num = qq_num;
    }
}
