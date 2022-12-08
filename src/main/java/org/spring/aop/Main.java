package org.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println("Hello world!");

    ShoppingCart cart=context.getBean(ShoppingCart.class);
    cart.checkout("CANCELLED");

    }
}