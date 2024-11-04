package com.example.EmailServiceDemoProject.kafka;

import com.example.BaseDomain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(EmailConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}")
    private void consume(OrderEvent orderEvent)
    {
    LOGGER.info(String.format(" Order Event Received in Email Services => %s",orderEvent.toString()));

   //send Email to the Customer

    }


}
