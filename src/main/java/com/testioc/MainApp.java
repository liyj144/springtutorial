package com.testioc;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by liyanjie on 2017/1/20.
 */
public class MainApp {
    public static void main(String[] args){
        // example1
        /*
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        obj.getMessage();
        */
        // example2
        //ApplicationContext context = new FileSystemXmlApplicationContext("classpath:Beans.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath:Beans.xml");
        HelloWorld obja = (HelloWorld) context.getBean("helloWorld");
        obja.setMessage("I'm object A");
        obja.getMessage();
        System.out.println("obja : " + obja.hashCode());
        // test scope
        HelloWorld objb = (HelloWorld) context.getBean("helloWorld");
        objb.getMessage();
        System.out.println("objb : " + objb.hashCode());
        context.registerShutdownHook();
    }
}
