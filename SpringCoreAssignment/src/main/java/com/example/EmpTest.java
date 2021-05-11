package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Employee;


public class EmpTest 
{
    public static void main( String[] args ) {

	 ApplicationContext context = new ClassPathXmlApplicationContext("empContext.xml"); 
			
    Employee emp = (Employee)context.getBean("empObj");
	        System.out.println( emp );
	        }
    }
