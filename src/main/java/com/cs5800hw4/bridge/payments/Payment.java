package com.cs5800hw4.bridge.payments;

import com.cs5800hw4.bridge.notificationchannels.NotificationChannel;

public abstract class Payment {
    protected NotificationChannel notificationChannel;

    abstract public void pay();

    public void sendNotification(String message) {
        this.notificationChannel.sendNotification(message);
    }
}
