package au.com.edimoto.springstudies.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(
//                KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
