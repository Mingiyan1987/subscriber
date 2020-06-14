package ru.basanov.subscriber.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionMessage {

    private Long msisdn;

    private ActionEnum actionEnum;

    private Long timestamp;

    @Override
    public String toString() {
        return "ActionMessage{" +
                "msisdn=" + msisdn +
                ", actionEnum=" + actionEnum +
                ", timestamp=" + timestamp +
                '}';
    }
}
