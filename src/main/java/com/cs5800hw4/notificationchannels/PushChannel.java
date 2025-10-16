package com.cs5800hw4.notificationchannels;

public class PushChannel implements NotificationChannel {
    public void sendNotification(String message) {
        System.out.println("Push Channel: " + message);
    }
}
