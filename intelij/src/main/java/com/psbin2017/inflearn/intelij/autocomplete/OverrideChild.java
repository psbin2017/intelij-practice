package com.psbin2017.inflearn.intelij.autocomplete;


// CTRL + I
// implements 의 구현 메소드 대상 객체를 @Override 를 선언하여 자동 생성
public class OverrideChild implements OverrideParent {

    @Override
    public int aging(int prevAge) {
        return 0;
    }

    @Override
    public String println(String printString) {
        return null;
    }

    @Override
    public void quit() {

    }
}
