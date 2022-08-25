package SpringBoot.com.controller;


import SpringBoot.com.bean.Person;
import SpringBoot.com.bean.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @Autowired
    Person person;

    @Autowired
    Tree tree;

    @GetMapping("/hello")
    public String sayHello(){
        return "hello everyone";
    }

    @GetMapping("/person")
    public String getPerson(){
        System.out.println(person.toString());
        return person.toString();
    }


    @GetMapping("/tree")
    public String getTree(){
        System.out.println(tree.toString());
        return tree.toString();
    }
}
