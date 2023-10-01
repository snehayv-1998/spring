package com.example.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		BeanFactory beanFactory = new FileSystemXmlApplicationContext("src\\main\\resources\\bean.xml");
		Triangle triangle = beanFactory.getBean("triangle",Triangle.class);
		System.out.println(triangle);
		triangle.printPoints();

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Square square = applicationContext.getBean("square",Square.class);
		square.printPoints();
	}

}
