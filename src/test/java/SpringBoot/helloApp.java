package SpringBoot;

import SpringBoot.com.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class helloApp {


    @Autowired
    Person person;
    @Test
    public void test(){
        System.out.println(person);
    }

}
