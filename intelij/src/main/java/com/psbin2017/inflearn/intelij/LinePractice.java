package com.psbin2017.inflearn.intelij;

public class LinePractice {

    public void copyLine() {
        // CTRL + D
        System.out.println("현재 줄을 복사한다.");
        System.out.println("현재 줄을 복사한다.");
        System.out.println("현재 줄을 복사한다.");
        System.out.println("현재 줄을 복사한다.");
        // CTRL + Y
    }

    public String joinLine() {
        String joinText = "안녕하세요."
                    + "환영합니다."
                    + "문자열을 합쳐봐요";

        // CTRL + SHIFT + J
        String joinText2 = "안녕하세요.환영합니다.문자열을 합쳐봐요";

        // 예제 상황: 줄바꿈된 문자열을 작성하고 합치는 경우
        String query = "SELECT * " +
                    "FROM MEMBER " +
                    "WHERE MEMBER_ID = member1 ";

        return joinText;
    }

    public void moveLine() {
        // SHIFT + ALT + ↑/↓ : 문법과 관계 없는 이동
        // SHIFT + CTRL + ↑/↓ : 문법과 관계 있는 이동 (메소드)
        System.out.println("라인 단위로 이동해보자");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
