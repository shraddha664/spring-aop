package org.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
//        logging
//        authentication and authorization
        System.out.println("checkout method from shoppingcart is called");
    }
    public int quantity(){
        return  2;
    }
}
