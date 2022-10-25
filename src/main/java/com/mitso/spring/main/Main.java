package com.mitso.spring.main;
import com.mitso.spring.generator.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Main {
    private static final String CONFIGURATION_PATH = "context.xml";
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext(CONFIGURATION_PATH);
        Calculator calculator = (Calculator) context.getBean("calculator");
        System.out.println(calculator.generate());
    }
}