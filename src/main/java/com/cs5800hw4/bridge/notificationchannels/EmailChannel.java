package com.cs5800hw4.bridge.notificationchannels;

public class EmailChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("Email Channel: " + message);
    }
}
