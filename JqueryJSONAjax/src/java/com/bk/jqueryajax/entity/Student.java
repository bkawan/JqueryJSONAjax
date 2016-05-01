/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bk.jqueryajax.entity;

/**
 *
 * @author bkawan
 * @date Apr 26, 2016
 * @time 8:39:39 PM
 */
public class Student {
    
    public int id;
    public String name;
    public boolean status;

    public Student(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", status=" + status + '}';
    }
    

}
