package SpringBoot.com.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = "classpath:tree.properties")
@Component
public class Tree {
    @Value("${tree.high}")
    private int high;
    @Value("${tree.weight}")
    private int weight;

    @Override
    public String toString() {
        return "Tree{" +
                "high=" + high +
                ", weight=" + weight +
                '}';
    }
}
