package com.psbin2017.inflearn.intelij.focus;

public class FocusPractice {
    public void increaseFocus() {
        // CTRL + W
        // 확장 선택
        StringBuilder sb = new StringBuilder();

        // 인자 값도 확장 선택이 가능
        sb.replace(1, 10, "hello");

        // CTRL + CTRL + ↑/↓
        // 다중 선택
        sb.replace(1, 10, "hello");
        sb.append("hello world");
        sb.append("hello world");
        sb.append("hello world");
        sb.replace(1, 10, "hello");
        sb.replace(1, 10, "hello");
        sb.replace(1, 10, "hello");
    }

    public void moveError() {
        // F2
        return "";
    }
}
