package com.learn.spring6.greeting;

import com.learn.spring6.controllers.GreetingController;
import com.learn.spring6.services.i18n.GreetingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ES")
@SpringBootTest
public class GreetingSpanishTest {

    @Autowired
    private GreetingController greetingController;

    @Test
    public void testGreeting() {
        greetingController.sayHello();
    }

}
