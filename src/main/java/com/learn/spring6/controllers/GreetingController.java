package com.learn.spring6.controllers;

import com.learn.spring6.services.i18n.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        greetingService.sayHello();
    }

}
