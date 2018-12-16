package kr.ac.hansung.csemall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/ac/hansung/conf/beans.xml");
		
		OfferDAO offerDao = (OfferDAO) context.getBean("offerDAO");
		
		System.out.println("The record count is " + offerDao.getRowCount());
		context.close();
	}
}
