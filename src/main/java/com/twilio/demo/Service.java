package com.twilio.demo;

import org.springframework.beans.factory.annotation.Qualifier;

@org.springframework.stereotype.Service
public class Service {
    private final TwilioSmsSender smsSender;

    public Service(@Qualifier("twilio") TwilioSmsSender smsSender) {
        this.smsSender = smsSender;
    }

    public void semdSms(SmsRequest smsRequest) {
        smsSender.sendSms(smsRequest);
    }
}
