package com.example.exmaple_03.service;

import com.example.exmaple_03.entity.TestEntity;
import com.example.exmaple_03.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    public Long save() {
        TestEntity testEntity = new TestEntity();
        testEntity.setColumn1("컬럼1");
        testEntity.setTestColumn2("컬럼2");
      Long id =  testRepository.save(testEntity).getId();
        return id;

    }
}
