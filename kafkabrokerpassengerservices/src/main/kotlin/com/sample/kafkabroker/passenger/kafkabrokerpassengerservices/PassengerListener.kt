package com.sample.kafkabroker.passenger.kafkabrokerpassengerservices

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class PassengerListener {

    @KafkaListener(topics = ["bus-journey"])
    public fun getBusJourney(journey: String) {
        System.out.println("Bus: $journey"
        )
    }
}