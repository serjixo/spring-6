package com.learn.spring6.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {

    public void sayHello() {
        System.out.println("Hello world!");
    }

}
