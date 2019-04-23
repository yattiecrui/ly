package com.ly.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "teacher")
public class Teacher {
    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
}
