package com.training.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;

public class AutoWiring {

	public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("AutoWiring.xml");
	Invoice inv = ctx.getBean(Invoice.class);

	System.out.println("addtress"+inv.getCust().getAddr());

	}

}
