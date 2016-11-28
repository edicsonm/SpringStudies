package au.com.edimoto.springstudies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                au.com.edimoto.springstudies.config.KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
