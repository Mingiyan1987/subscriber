package ru.basanov.subscriber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@EnableIntegration
@IntegrationComponentScan("ru.basanov.subscriber.integration")
public class AppConfiguration {

    @Bean
    public MessageChannel actionChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel purchaseChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel nullableChannel() {
        return new DirectChannel();
    }
    
}
