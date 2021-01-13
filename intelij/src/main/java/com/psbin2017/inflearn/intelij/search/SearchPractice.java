package com.psbin2017.inflearn.intelij.search;

public class SearchPractice {

    public void find() {
        // CTRL + F
        // 검색
        String str = "textFind";
    }

    public void replace() {
        // CTRL + R
        // 검색 및 변경
        String str = "model: 문자열 찾아 바꾸기";

        System.out.println("model: 바꾸기");
    }

    public void regex() {
        // CTRL + SHIFT + R
        // regex from \/hello\/[a-z]*\/sample1.html
        // to \/well\/[a-z]*\/sample1.html
        String regex1 = "/well/[a-z]*/sample1.html";
        String regex2 = "/well/[a-z]*/sample1.html";

        String regex3 = "/hello/world/sample2.html";
        String regex4 = "/hello/google/sample2.html";
    }
}
