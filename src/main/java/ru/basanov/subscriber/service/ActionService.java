package ru.basanov.subscriber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.basanov.subscriber.model.Action;
import ru.basanov.subscriber.repository.ActionRepository;

@Service
public class ActionService {

    private ActionRepository actionRepository;

    @Autowired
    public void setActionRepository(ActionRepository actionRepository) {
        this.actionRepository = actionRepository;
    }

    @Transactional
    public Action save(Action action) {
        return actionRepository.save(action);
    }

}
