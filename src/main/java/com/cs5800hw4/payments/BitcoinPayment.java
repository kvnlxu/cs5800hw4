package com.cs5800hw4.payments;

import com.cs5800hw4.notificationchannels.NotificationChannel;

public class BitcoinPayment extends Payment{

    public BitcoinPayment(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void pay() {
        this.sendNotification("A Bitcoin payment was made.");
    }
}
