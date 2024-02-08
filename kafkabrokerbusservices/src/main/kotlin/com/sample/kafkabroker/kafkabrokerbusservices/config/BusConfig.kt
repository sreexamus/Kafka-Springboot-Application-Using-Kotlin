package com.sample.kafkabroker.kafkabrokerbusservices.config

import com.sample.kafkabroker.kafkabrokerbusservices.constants.BusConstants
import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class BusConfig {
    @Bean
    fun getTopic(): NewTopic {
        return TopicBuilder
            .name(BusConstants.BUS_TOPIC_NAME)
            .build()
    }
}