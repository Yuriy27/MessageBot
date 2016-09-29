package com.github.yuriy27.controller;

import com.github.yuriy27.enums.SendResult;
import com.github.yuriy27.objects.DelMessage;
import com.github.yuriy27.objects.Delivery;

public interface IDeliveryController {

    public SendResult sendMessage(DelMessage message);

    public SendResult sendDelivery(Delivery delivery, DelMessage message);

}
