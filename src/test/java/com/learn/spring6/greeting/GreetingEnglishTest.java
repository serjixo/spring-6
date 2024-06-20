package com.learn.spring6.greeting;

import com.learn.spring6.controllers.GreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("EN")
@SpringBootTest
public class GreetingEnglishTest {

    @Autowired
    private GreetingController greetingController;


    @Test
    public void greetingTest() {
        greetingController.sayHello();
    }

}