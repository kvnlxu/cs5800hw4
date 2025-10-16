package com.cs5800hw4.payments;

import com.cs5800hw4.notificationchannels.NotificationChannel;

public class OnlinePayment extends Payment {

    public OnlinePayment(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    @Override
    public void pay() {
        this.sendNotification("An online payment was made.");
    }
}
