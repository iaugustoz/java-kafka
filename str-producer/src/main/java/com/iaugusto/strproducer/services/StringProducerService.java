package com.iaugusto.strproducer.services;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) { // Envia qualquer mensagem para o tópico str-topic
        kafkaTemplate.send("str-topic", message);
    }
}
