package com.example.SpringAssignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.SpringAssignment.model.Demo;

public class App 
{
    public static void main( String[] args )
    {

   	 ApplicationContext context = new ClassPathXmlApplicationContext("MYDemo.xml"); 
   			
       Demo d = (Demo)context.getBean("DemoObj");
   	        System.out.println( d );
    }
}
