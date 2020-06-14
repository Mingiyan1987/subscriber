package ru.basanov.subscriber.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.subscriber.model.Purchase;

@Repository
public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {

}
