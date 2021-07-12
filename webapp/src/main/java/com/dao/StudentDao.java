package com.dao;

import com.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @title: interface:StudentDao
 * @Author Goodwin
 * @Date: 2021/7/1 22:10
 * @Description:
 */
@Mapper
@Repository
public interface StudentDao {
    List<Student> selectAll();
    Student byId(Integer id);
    void addId(Student student);
    void deleteById(Integer id);
    void update(Student student);
}
