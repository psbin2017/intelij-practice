package com.psbin2017.inflearn.intelij.refactoring;

public class InnerClass {

    public void hello() {
        Team team = new Team("hello", 1);
    }

    // F6
    // 이너클래스 클래스로 추출
    /**
    public static class Team {
        private String name;
        private int number;

        public Team(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }
     */
}
