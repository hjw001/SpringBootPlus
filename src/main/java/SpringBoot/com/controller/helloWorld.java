package SpringBoot.controller.com.controller;


import SpringBoot.controller.com.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @Autowired
    Person person;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello everyone";
    }

    @GetMapping("/person")
    public String getPerson(){
        return person.toString();
    }

}
