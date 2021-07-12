package com.example.demo.mapper;

import com.example.demo.entity.Emp;

import java.util.List;
import java.util.Map;

/**
 * @title: interface:EmpMapper
 * @Author Goodwin
 * @Date: 2021/7/11 16:58
 * @Description:
 */
public interface EmpMapper {
    Emp findById(Integer empno);
    List<Map> findDepts(Map param);
    void create(Emp emp);
    void update(Emp emp);
    void delete(Integer empno);
    List<Emp> all();
}
