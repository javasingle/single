package com.single.singletest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SingleTestApplicationTests {

    @Test
    void singletest(){
        System.out.println("single spring test");
    }

}
