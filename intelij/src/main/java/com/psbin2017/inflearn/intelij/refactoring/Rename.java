package com.psbin2017.inflearn.intelij.refactoring;

public class Rename {

    public void rename() {
        // SHIFT + F6
        String replaceNaming = "";

        for (int i = 0; i < 10; i++) {
            System.out.println(replaceNaming);
        }
    }

    // CTRL + SHIFT + F6
    // Type Migration
    // 타입을 일괄적으로 변경해줌, 단 return 은 ignore 후 변경해주어야함
    public Integer calculate() {
        return 1;
    }

    // CTRL + ALT + O
    // 사용하지 않는 import 제거

    // Actions optimize imports on
    // 자동으로 사용하지 않는 imports 를 제거해준다.

    // CTRL + ALT + L
    // 인텔리제이 기준 인덴트로 강제 변경
    public void reIndent() {
        System.out.println("hello world");
    }
}
