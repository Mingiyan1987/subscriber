package ru.basanov.subscriber.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.subscriber.model.Action;

@Repository
public interface ActionRepository extends PagingAndSortingRepository<Action, Long> {

}
