package com.psbin2017.inflearn.intelij.autocomplete;

public interface OverrideParent {
    public int aging(int prevAge);
    public String println(String printString);
    public void quit();

    public default void defaultMethod() {
        System.out.println("디폴트 메소드는 제외");
    }
}
