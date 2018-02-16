package com.si.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.si.beans.Question;
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/si/common/application-context.xml");
		Question question = (Question) context.getBean("question",
				Question.class);
		System.out.println(question);
	}
}
