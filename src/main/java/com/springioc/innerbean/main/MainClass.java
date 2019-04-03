package com.springioc.innerbean.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.innerbean.beans.Car;
import com.springioc.innerbean.beans.User;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		User user = (User)context.getBean("user");
		System.out.println(user.getName());
		System.out.println(user.getCar().getName());
		System.out.println(user.getCar().getPrice());
		
		//fails due to inner bean scope
		Car car = (Car)context.getBean("car");
		System.out.println(car.getName());
		System.out.println(car.getPrice());

	}

}
