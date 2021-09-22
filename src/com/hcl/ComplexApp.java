package com.hcl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ComplexApp {

	public static void main(String[] args) {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Complex complex3 = (Complex)beanFactory.getBean("complex1");
		Complex complex4 = (Complex)beanFactory.getBean("complex2");
		complex3.display();
		complex4.display();
		Complex c = complex3.add(complex4);
		c.display();
	}
	
	
	 
}

	

	 

	 

	 

	 

