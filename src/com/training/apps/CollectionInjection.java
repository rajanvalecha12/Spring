package com.training.apps;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.domains.Invoice;
import com.training.domains.Item;

public class CollectionInjection {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Coll_Injection.xml");
		Invoice inv = ctx.getBean(Invoice.class);

		System.out.println("addtress"+inv.getCust().getAddr());
		System.out.println("customer"+inv.getCust());
		List<Item> itemList=inv.getItemList();
		for(Item obj:itemList)
		{
			System.out.println(obj);
		}
		System.out.println("Amount"+inv.getAmount());
		System.out.println("taxes"+ inv.getTaxes());
	}

}
