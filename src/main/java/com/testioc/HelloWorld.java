package com.testioc;

/**
 * Created by liyanjie on 2017/1/20.
 */
public class HelloWorld {
    private String message;
    private String message1;
    private String message2;
    public void setMessage(String message){
        this.message = message;
    }
    public void getMessage() {
        System.out.println("Your Message is " + message);
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void init() {
        System.out.println("init ...");
    }

    public void destory(){
        System.out.println("destory ...");
    }
}
