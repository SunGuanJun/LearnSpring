package com.sunguanjun.TryMongoDB;

import java.util.Arrays;

import orders.Item;
import orders.Order;
import orders.config.MongoConfig;
import orders.db.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = 
    			new AnnotationConfigApplicationContext(MongoConfig.class);
        MongoOperations mongo = (MongoOperations) context.getBean("mongoTemplate");
        
        mongo.save(createAnOrder());
        
        System.out.println("ok");
    }
    
    private static Order createAnOrder() {
		Order order = new Order();
		order.setCustomer("Chuck Wagon");
		order.setType("WEB");
		Item item1 = new Item();
		item1.setProduct("Spring in Action");
		item1.setQuantity(2);
		item1.setPrice(29.99);
		Item item2 = new Item();
		item2.setProduct("Module Java");
		item2.setQuantity(31);
		item2.setPrice(29.95);
		order.setItems(Arrays.asList(item1, item2));
		return order;
	}
}
