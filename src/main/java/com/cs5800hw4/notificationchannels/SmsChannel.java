package com.cs5800hw4.notificationchannels;

public class SmsChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("SMS Channel: " + message);
    }
}
