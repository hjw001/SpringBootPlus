package SpringBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("SpringBoot.com.bean")
public class helloApp {
    public static void main(String[] args) {
        SpringApplication.run(helloApp.class);

    }
}
