package com.cs5800hw4.bridge.payments;

import com.cs5800hw4.bridge.notificationchannels.NotificationChannel;

public class CashOnDeliveryPayment extends Payment{

    public CashOnDeliveryPayment(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void pay() {
        this.sendNotification("A cash on delivery payment was made.");
    }
}
