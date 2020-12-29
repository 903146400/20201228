package com.wjx;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class SpringbootApplicationTests {

    @Test
    void contextLoads() {
        log.info("success!");
        log.warn("warn");
        log.error("error");
        log.debug("debug");
        System.out.println("success");
    }


}
