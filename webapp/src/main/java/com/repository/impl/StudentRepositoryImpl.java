//package com.repository.impl;
//
//import com.entity.Student;
//import com.repository.StudentRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author ohhhhhhhhh
// * @description:
// * @date 2021/6/19 21:42
// */
//@Repository
//public class StudentRepositoryImpl implements StudentRepository {
//    //集合替代数据库
//    private static Map<Integer,Student> map;
//    static {
//        map = new HashMap<>();
//        map.put(1,new Student(1,"张三","123456789152"));
//        map.put(2,new Student(2,"李四","123456742334"));
//        map.put(3,new Student(3,"王五","123453444152"));
//    }
//
//    @Override
//    public Collection<Student> selectAll() {
//        return map.values();
//    }
//
//    @Override
//    public Student ById(Integer id) {
//        return map.get(id);
//    }
//
//    @Override
//    public void addId(Student student) {
//      map.put(student.getId(),student );
//
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//        map.remove(id);
//
//    }
//
//    @Override
//    public void update(Student student) {
//        map.put(student.getId(),student);
//    }
//}
