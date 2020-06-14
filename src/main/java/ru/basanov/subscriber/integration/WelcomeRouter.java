package ru.basanov.subscriber.integration;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;
import ru.basanov.subscriber.dto.ActionEnum;
import ru.basanov.subscriber.dto.ActionMessage;

@MessageEndpoint
public class WelcomeRouter {

    @Router(inputChannel = "welcomeChannel")
    public String route(ActionMessage actionMessage) {
        String channel = null;
        if (actionMessage.getActionEnum() == ActionEnum.ACTION) {
            channel = "actionChannel";
        } else if (actionMessage.getActionEnum() == ActionEnum.PURCHASE) {
            channel = "purchaseChannel";
        }
        return channel;
    }
}
