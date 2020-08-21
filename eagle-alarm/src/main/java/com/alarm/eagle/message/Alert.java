package com.alarm.eagle.message;

import com.alarm.eagle.rule.Rule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alert<Event, Value> {
    private Integer ruleId;
    private Rule violatedRule;
    private String key;

    private Event triggeringEvent;
    private Value triggeringValue;
}
