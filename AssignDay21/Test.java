package com.SpringCore;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
	
	//Employee emp= new Employee(123, "bansal", 78203, "jaipur");
	
	Resource resource = new ClassPathResource("springEg.xml");
	
	
	BeanFactory factory= new XmlBeanFactory(resource);
	
	  Employee emp =(Employee) factory.getBean("sleeping");
	  
	  System.out.println(emp);
	
	
}
}

