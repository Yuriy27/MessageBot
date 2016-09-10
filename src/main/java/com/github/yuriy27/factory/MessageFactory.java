package com.github.yuriy27.factory;

import com.github.yuriy27.objects.DelMessage;

public class MessageFactory {

    public static DelMessage get(String subject, String text, String to) {
        return new DelMessage(subject, text, to);
    }

}
