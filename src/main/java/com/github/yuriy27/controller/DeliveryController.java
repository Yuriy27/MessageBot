package com.github.yuriy27.controller;

import com.github.yuriy27.config.Config;
import com.github.yuriy27.enums.SendResult;
import com.github.yuriy27.objects.DelMessage;
import com.github.yuriy27.objects.Delivery;
import com.github.yuriy27.objects.Sender;

public class DeliveryController implements IDeliveryController{

    Sender sender = new Sender(Config.MAIL, Config.PASSWORD);

    @Override
    public SendResult sendMessage(DelMessage message) {
        if (message.getSubject().equals("") || message.getText().equals("") || message.getTo().equals(""))
            return SendResult.FAILED;
        return sender.send(message);
    }

    @Override
    public SendResult sendDelivery(Delivery delivery, DelMessage message) {
        SendResult result = SendResult.SUCCESS;
        for (String to : delivery.getRecepiens()) {
            message.setTo(to);
            if (this.sendMessage(message) == SendResult.FAILED) {
                result = SendResult.FAILED;
            }
        }

        return result;
    }
}
