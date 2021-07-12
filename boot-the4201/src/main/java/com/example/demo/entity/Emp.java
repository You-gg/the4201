package com.example.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @title: Emp
 * @Author Mr.Goodwin
 * @Date: 2021/7/11 16:56
 * @Description:
 */
@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Float sal;
    private Float comm;
    private Integer deptno;
}
