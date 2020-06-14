package ru.basanov.subscriber.integration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import ru.basanov.subscriber.dto.ActionMessage;
import ru.basanov.subscriber.model.Purchase;
import ru.basanov.subscriber.service.PurchaseService;

@MessageEndpoint
@Slf4j
public class PurchaseListener {

    private PurchaseService purchaseService;

    @Autowired
    public void setPurchaseService(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @ServiceActivator(inputChannel = "purchaseChannel")
    public void handler(final ActionMessage actionMessage) {
        Purchase purchase = purchaseService.save(new Purchase(actionMessage.getMsisdn(), actionMessage.getTimestamp()));
        log.info("Добавлена запись в таблицу purchase", purchase.toString());
    }
}
