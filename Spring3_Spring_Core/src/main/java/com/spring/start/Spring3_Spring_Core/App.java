package com.spring.start.Spring3_Spring_Core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext factory=
    			new ClassPathXmlApplicationContext("/com/spring/start/Spring3_Spring_Core/Spring.xml");
    	
    	
    	Alien obj=(Alien)factory.getBean("alien");
    	obj.code();
    }
}
