package com.service;

import com.entity.Student;

import java.util.Collection;
import java.util.List;

/**
 * @author ohhhhhhhhh
 * @description:
 * @date 2021/6/19 21:47
 * 查全部
 * 查id
 * 按id加
 * 删除
 * 修改
 */
public interface StudentService {
    List<Student> selectAll();
    Student byId(Integer id);
    void addId(Student student);
    void deleteById(Integer id);
    void update(Student student);
}
