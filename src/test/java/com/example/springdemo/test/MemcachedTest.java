package com.example.springdemo.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class MemcachedTest {
    private Long time;


    @Test
    void contextLoads() {

    }

    @BeforeEach
    public void setUp() {
        this.time = System.currentTimeMillis();
        log.info("==> 测试开始执行 <==");
    }

    @AfterEach
    public void tearDown() {
        log.info("==> 测试执行完成，耗时：{} ms <==", System.currentTimeMillis() - this.time);
    }

}
