package com.cs5800hw4.payments;

import com.cs5800hw4.notificationchannels.NotificationChannel;

public abstract class Payment {
    protected NotificationChannel notificationChannel;

    abstract public void pay();

    public void sendNotification(String message) {
        this.notificationChannel.sendNotification(message);
    }
}
