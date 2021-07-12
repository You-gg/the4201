package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ohhhhhhhhh
 * @description: 学生类
 * @date 2021/6/19 15:33
 */
@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private String phone;
    private String IdCard;
}
