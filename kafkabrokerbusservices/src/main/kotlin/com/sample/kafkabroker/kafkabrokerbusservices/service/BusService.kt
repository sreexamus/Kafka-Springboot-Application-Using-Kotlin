package com.sample.kafkabroker.kafkabrokerbusservices.service

import com.sample.kafkabroker.kafkabrokerbusservices.constants.BusConstants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@Service
class BusService {
    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, Any>
    fun sendBusMessage(message: String) {
        kafkaTemplate.send(BusConstants.BUS_TOPIC_NAME, message)
    }
}