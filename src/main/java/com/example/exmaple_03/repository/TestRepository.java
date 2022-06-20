package com.example.exmaple_03.repository;

import com.example.exmaple_03.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TestRepository extends JpaRepository<TestEntity,Long> {

}
