package com.cs5800hw4.bridge;

import com.cs5800hw4.bridge.notificationchannels.EmailChannel;
import com.cs5800hw4.bridge.notificationchannels.PushChannel;
import com.cs5800hw4.bridge.notificationchannels.SmsChannel;
import com.cs5800hw4.bridge.payments.BitcoinPayment;
import com.cs5800hw4.bridge.payments.CashOnDeliveryPayment;
import com.cs5800hw4.bridge.payments.OnlinePayment;
import com.cs5800hw4.bridge.payments.Payment;

public class Driver {
    public static void main(String[] args) {
        Payment onlineEmailPayment = new OnlinePayment(new EmailChannel());
        Payment onlineSmsPayment = new OnlinePayment(new SmsChannel());
        Payment cashEmailPayment = new CashOnDeliveryPayment(new EmailChannel());
        Payment cashSmsPayment = new CashOnDeliveryPayment(new SmsChannel());
        onlineEmailPayment.pay();
        onlineSmsPayment.pay();
        cashEmailPayment.pay();
        cashSmsPayment.pay();

        Payment bitcoinEmailPayment = new BitcoinPayment(new EmailChannel());
        Payment bitcoinSmsPayment = new BitcoinPayment(new SmsChannel());
        bitcoinEmailPayment.pay();
        bitcoinSmsPayment.pay();

        Payment onlinePushPayment = new OnlinePayment(new PushChannel());
        Payment cashPushPayment = new CashOnDeliveryPayment(new PushChannel());
        onlinePushPayment.pay();
        cashPushPayment.pay();
    }
}
