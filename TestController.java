package com.springboot.demo.test;

import bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public Person hello() {
        Person person = new Person();
        person.setName("zhangsan").setAge(18);
        return person;
    }
}
