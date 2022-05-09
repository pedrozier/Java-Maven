package com.standart.kafka.events;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class MyEventConsumer {

    private final KafkaConsumer<String, String> consumer;

    public MyEventConsumer() {
        consumer = createConsumer();
    }

    private KafkaConsumer<String, String> createConsumer() {
        if (consumer != null) {
            return consumer;
        }

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("group.id", "default");

        return new KafkaConsumer<String, String>(properties);

    }

    public void executar() {
        List<String> topics = new ArrayList<>();
        topics.add("TestEvent");

        consumer.subscribe(topics);

        System.out.println("Iniciando consumer...");

        boolean active = true;

        while (active) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record : records) {
                saveMessage(record.topic(), record.partition(), record.value());
                if (record.value().equals("FECHAR")) {
                    active = false;
                }
            }
        }

    }

    private void saveMessage(String topic, int partition, String message) {
        System.out.println("Topico: " + topic + " , Particao: " + partition + " , Mensagem: " + message);
    }

}