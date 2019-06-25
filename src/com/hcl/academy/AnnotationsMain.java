package com.hcl.academy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMain {
    public static void main(String[] args) {
        //feed the context on the core container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from the context
        Coach theCoach=context.getBean("myCoach",Coach.class);

        //use the methods
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
