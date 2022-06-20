package com.example.exmaple_03.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "test_table")//테이블 이름 설정
//error 1032 포트충돌
public class TestEntity {
    //@GeneratedValue(strategy = GenerationType.IDENTITY) == auto_increment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "test_id")
    private Long id;


    @Column(name = "test_column1",length = 50)
    private String column1;

    @Column(unique = true)//컬럼 유니크 설정
    private String testColumn2;

}

