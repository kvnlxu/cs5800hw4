package com.cs5800hw4.bridge.payments;

import com.cs5800hw4.bridge.notificationchannels.NotificationChannel;

public class BitcoinPayment extends Payment{

    public BitcoinPayment(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void pay() {
        this.sendNotification("A Bitcoin payment was made.");
    }
}
