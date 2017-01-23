package com.testioc;

/**
 * Created by liyanjie on 2017/1/20.
 */
public class TextEditor2 {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("2: Inside setSpellChecker. ");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
