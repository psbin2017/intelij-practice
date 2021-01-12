package com.psbin2017.inflearn.intelij.Immediate;

public class EmailSender {

    private long id;

    private String email;

    private String name;

    public EmailSender(long id, String email,String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public static void receive(String from, String to) {
        // CTRL + SHIFT + J
        String receiveText = from + "님으로 부터 " + to + "님이 메일을 받았습니다.";
        System.out.println(receiveText);
    }

    public void send(String to) {
        // CTRL + SHIFT + J
        String sendText = this.email + "님이 " + to + " 님에게 메일을 보냅니다.";
        System.out.println(sendText);
    }

    public String getEmail() {
        return this.email;
    }
}
