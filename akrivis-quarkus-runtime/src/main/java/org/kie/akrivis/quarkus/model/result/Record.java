package org.kie.akrivis.quarkus.model.result;

public record Record(String status, Number measureValue, String measureName,
                     Number maxValue, String yaml, Threshold[] thresholds) {
}
