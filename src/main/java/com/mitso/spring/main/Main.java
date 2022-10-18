package com.mitso.spring.main;
import com.mitso.spring.service.GeneratorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {
    private static final String CONFIGURATION_PATH = "context.xml";
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext(CONFIGURATION_PATH);
        GeneratorService service = (GeneratorService)
                context.getBean("generatorService");
        List<String> generated = service.generateStrings();
        for (String s : generated) {
            System.out.println(s);
        }
    }
}