package com.main;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;
import com.testioc.HelloIndia;
import com.testioc.HelloWorld;
import com.testioc.TextEditor;
import com.testioc.TextEditor2;
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
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obja = (HelloWorld) context.getBean("helloWorld");
        obja.setMessage("I'm object A");
        obja.getMessage();
        System.out.println("obja : " + obja.hashCode());

        obja.getMessage1();
        obja.getMessage2();

        // test scope
        HelloIndia objb = (HelloIndia) context.getBean("helloIndia");
        System.out.println("objb : " + objb.hashCode());

        objb.getMessage1();
        objb.getMessage2();
        objb.getMessage3();

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();

        TextEditor2 te2 = (TextEditor2) context.getBean("textEditor2");
        te2.spellCheck();

        context.registerShutdownHook();
    }
}
