package com.psbin2017.inflearn.intelij.refactoring;

import java.util.List;

public class Variable {

    public void extractVariable() {
        // CTRL + ALT + V
        // 동일한 내용 뽑아내어 리팩토링
        String format = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(format);
        System.out.println(format);
    }

    public void extractParameter() {
        // 상수를 오버로딩 메소드로도 생성 가능
        extractParameter(10);
    }

    public void extractParameter(int x) {
        // CTRL + ALT + P
        // 선택한 값 변수화
        System.out.println(x);
        System.out.println(x);
    }

    public void extractMethodOrigin(List<Book> books) {
        for (Book book : books) {
            for ( String s : book.getAuthors() ) {
                if ( "hello".equals(s) ) {
                    System.out.println("world");
                }
            }
        }
    }

    public void extractMethod(List<Book> books) {
        // CTRL + ALT + M
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        // CTRL + ALT + M
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    private void print(String s) {
        // CTRL + ALT + M
        // 메소드 꺼내기
        if ("hello".equals(s)) {
            System.out.println("world");
        }
    }

    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public List<String> getAuthors() {
            return authors;
        }
    }
}
