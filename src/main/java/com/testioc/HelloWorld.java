package com.testioc;

/**
 * Created by liyanjie on 2017/1/20.
 */
public class HelloWorld {
    private String message;
    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage() {
        System.out.println("Your Message is " + message);
    }

    public void init() {
        System.out.println("init ...");
    }

    public void destory(){
        System.out.println("destory ...");
    }
}
