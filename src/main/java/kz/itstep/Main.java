package kz.itstep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kz.itstep");
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("context.xml");

        MyRepository myRepository = context1.getBean("myRepository", MyRepository.class);

        myRepository.findAll();
    }
}