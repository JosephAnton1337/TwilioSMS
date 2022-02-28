package com.twilio.demo;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class twilioInitializer {
    private final static Logger LOGGER = LoggerFactory.getLogger(twilioInitializer.class);

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public twilioInitializer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(
                twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken()
        );
        LOGGER.info("Twilio initialozed ..with account sid{} ", twilioConfiguration.getAccountSid());
    }
}
