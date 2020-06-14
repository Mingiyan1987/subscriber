package ru.basanov.subscriber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.basanov.subscriber.dto.ActionMessage;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "action")
@Getter
@Setter
@NoArgsConstructor
public class Action {

    @Id
    private Long msisdn;

    private Long timestamp;

    public Action(Long msisdn, Long timestamp) {
        this.msisdn = msisdn;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Action{" +
                "msisdn=" + msisdn +
                ", timestamp=" + timestamp +
                '}';
    }
}
