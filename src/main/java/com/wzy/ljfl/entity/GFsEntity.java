package com.wzy.ljfl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "GFs")
public class GFsEntity implements Serializable {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "birth")
    private String birth;
    @Column(name = "height")
    private int height;
    @Column(name = "weight")
    private int weight;
    @Column(name = "yanzhi")
    private int yanzhi;
    @Column(name = "dirct")
    private String dirct;
    @Column(name = "st")
    private String st;
    @Column(name = "work")
    private String work;
    @Column(name = "ins")
    private int ins;
    @Column(name = "rec")
    private String rec;
    @Column(name = "loveme")
    private int loveme;
    @Column(name = "ilove")
    private int ilove;
    @Column(name = "relate")
    private int relate;
    @Column(name = "others")
    private int others;
    @Column(name = "futureinbj")
    private int futureinbj;
    @Column(name = "marks")
    private String marks;
    @Column(name = "sort")
    private int sort;
    @Column(name = "point")
    private int point;
    @Column(name = "point_now")
    private int point_now;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYanzhi() {
        return yanzhi;
    }

    public void setYanzhi(int yanzhi) {
        this.yanzhi = yanzhi;
    }

    public String getDirct() {
        return dirct;
    }

    public void setDirct(String dirct) {
        this.dirct = dirct;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public String getRec() {
        return rec;
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public int getLoveme() {
        return loveme;
    }

    public void setLoveme(int loveme) {
        this.loveme = loveme;
    }

    public int getIlove() {
        return ilove;
    }

    public void setIlove(int ilove) {
        this.ilove = ilove;
    }

    public int getRelate() {
        return relate;
    }

    public void setRelate(int relate) {
        this.relate = relate;
    }

    public int getOthers() {
        return others;
    }

    public void setOthers(int others) {
        this.others = others;
    }

    public int getFutureinbj() {
        return futureinbj;
    }

    public void setFutureinbj(int futureinbj) {
        this.futureinbj = futureinbj;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getPoint_now() {
        return point_now;
    }

    public void setPoint_now(int point_now) {
        this.point_now = point_now;
    }
}
