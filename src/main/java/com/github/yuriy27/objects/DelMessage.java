package com.github.yuriy27.objects;

/**
 * Created by Юра on 10.09.2016.
 */
public class DelMessage {

    private String subject;
    private String text;
    private String to;

    public DelMessage(String subject, String text, String to) {
        this.subject = subject;
        this.text = text;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String getText() {
        return text;
    }


    public String getTo() {
        return to;
    }

}
