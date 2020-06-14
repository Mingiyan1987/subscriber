package ru.basanov.subscriber.integration;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import ru.basanov.subscriber.dto.ActionMessage;
import ru.basanov.subscriber.model.Action;
import ru.basanov.subscriber.service.ActionService;

@MessageEndpoint
@Slf4j
public class ActionListener {

    private ActionService actionService;

    @Autowired
    public void setActionService(ActionService actionService) {
        this.actionService = actionService;
    }

    @ServiceActivator(inputChannel = "actionChannel")
    public void handler(final ActionMessage actionMessage) {
        Action action = actionService.save(new Action(actionMessage.getMsisdn(), actionMessage.getTimestamp()));
        log.info("Добавлена запись в таблицу action", action.toString());
    }

}
