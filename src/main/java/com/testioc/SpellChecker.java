package com.testioc;

/**
 * Created by liyanjie on 2017/1/20.
 */
public class SpellChecker {
    // 构造函数最先执行，然后执行init
    public SpellChecker() {
        System.out.println("Inside SpellChecker constructor.");
    }
    public void checkSpelling(){
        System.out.println("Inside checkSpelling.");
    }
}
