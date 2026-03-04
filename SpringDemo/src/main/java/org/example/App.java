package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args ) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = context.getBean(Alien.class);
        obj.build();
//        obj.setAge(18);
//        System.out.println(obj.getAge());

    }
}
