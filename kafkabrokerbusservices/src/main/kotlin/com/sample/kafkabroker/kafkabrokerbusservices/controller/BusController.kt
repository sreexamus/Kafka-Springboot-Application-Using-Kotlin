package com.sample.kafkabroker.kafkabrokerbusservices.controller

import com.sample.kafkabroker.kafkabrokerbusservices.service.BusService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/busjourney")
class BusController {
    @Autowired
    private lateinit var service: BusService;

    @GetMapping("/send")
    public fun getBusJourney(): ResponseEntity<Any> {
        (0..100).forEach {
            service.sendBusMessage(Math.random().toString())
        }
        return ResponseEntity.ok().build()
    }
}