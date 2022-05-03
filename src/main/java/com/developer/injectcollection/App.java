package com.developer.injectcollection;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*//Example1
       ApplicationContext context = new ClassPathXmlApplicationContext("com/developer/injectcollection/config.xml");
       Department obj = (Department)context.getBean("departmentBean");
       obj.show();
       */
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/developer/injectcollection/config2.xml");
    	MyCollection my = (MyCollection)context.getBean("myCollection");
    	// list
    	System.out.println("Get MyList Elements: ");
    	List<String> list = my.getMyList();
    	Iterator<String> itr = list.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    	
    	// set
    	System.out.println("Get MySet Elements: ");
    	Set<String> set = my.getMySet();
    	Iterator<String> itr2 = list.iterator();
    	while(itr2.hasNext())
    	{
    		System.out.println(itr2.next());
    	}
    	
    	// map
    	System.out.println("Get MyMap Elements: ");
    	Map<Integer,String> map = my.getMyMap();
    	for(Map.Entry<Integer, String> e:map.entrySet())
    	{
    		System.out.println(e.getKey()+" : "+e.getValue());
    	}
    	
    	// Book
    	System.out.println("Get Mybook Elements: ");
    	List<Book> b = my.getMyBook();
    	System.out.println(b.get(0).getBookName());
    	System.out.println(b.get(1).getBookName());
    	
    }
}
