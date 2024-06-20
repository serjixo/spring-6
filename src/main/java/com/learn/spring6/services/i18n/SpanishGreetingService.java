package com.learn.spring6.services.i18n;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile("ES")
@Service("i18nService")
@Primary
public class SpanishGreetingService implements GreetingService {

    public void sayHello() {
        System.out.println("Hola mundo!");
    }

}
