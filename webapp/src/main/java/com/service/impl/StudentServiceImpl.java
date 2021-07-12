package com.service.impl;

import com.dao.StudentDao;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @author ohhhhhhhhh
 * @description:
 * @date 2021/6/19 21:49
 */
@Service
public class StudentServiceImpl implements StudentService {
//    @Autowired       //自动装载
//    private StudentRepository repository;
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public Student byId(Integer id) {
        return studentDao.byId(id);
    }

    @Override
    public void addId(Student student) {
        studentDao.addId(student);
    }

    @Override
    public void deleteById(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }
}
