package ru.basanov.subscriber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.basanov.subscriber.dto.ActionMessage;
import ru.basanov.subscriber.model.Action;
import ru.basanov.subscriber.model.Purchase;
import ru.basanov.subscriber.repository.PurchaseRepository;

@Service
public class PurchaseService {

    private PurchaseRepository purchaseRepository;

    @Autowired
    public void setPurchaseRepository(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Transactional
    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

}
