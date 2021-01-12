package com.psbin2017.inflearn.intelij.Immediate;

public class ViewArguments {

    public void viewArguments() {
        // CTRL + P
        // 생성자 즉시 보기
        EmailSender emailSender = new EmailSender(1L, "email", "name");

        // CTRL + P
        // 정적 메소드 즉시 보기
        EmailSender.receive("from", "to");

        // SHIFT + CTRL + I
        // 구현부 즉시보기: 사용하고 있는 변수를 어떻게 만들었는지와(emailSender) 메소드(send()) 를 볼 수 있다.
        emailSender.send("email");
    }
}
