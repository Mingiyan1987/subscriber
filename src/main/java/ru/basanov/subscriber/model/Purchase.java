package ru.basanov.subscriber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.basanov.subscriber.dto.ActionMessage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
@Getter
@Setter
@NoArgsConstructor
public class Purchase{

    @Id
    private Long msisdn;

    private Long timestamp;

    public Purchase(Long msisdn, Long timestamp) {
        this.msisdn = msisdn;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "msisdn=" + msisdn +
                ", timestamp=" + timestamp +
                '}';
    }
}
