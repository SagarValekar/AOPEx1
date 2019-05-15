package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.controller.StudentController;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
	
	StudentController s=ac.getBean(StudentController.class,"studentController");
	s.show();
	
	
}
}
