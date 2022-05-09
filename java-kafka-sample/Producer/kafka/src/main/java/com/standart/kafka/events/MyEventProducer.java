package com.standart.kafka.events;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class MyEventProducer {

    private final Producer<String, String> producer;

    public MyEventProducer() {
        producer = createProducer();
    }

    private Producer<String, String> createProducer() {
        if (producer != null) {
            return producer;
        }

        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("serializer.class", "kafka.serializer.DefaultEncoder");

        return new KafkaProducer<String, String>(properties);
    }

    public void sendMessage() {

        String key = UUID.randomUUID().toString();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        String message = sdf.format(new Date());

        message += " | " + key;
        message += " | NOVA MENSAGEM";

        System.out.println("Enviando Mensagem...");

        ProducerRecord<String, String> record = new ProducerRecord<String, String>("TestEvent", key, message);

        producer.send(record);
        producer.flush();
        producer.close();

        System.out.println("Mensagem enviada com sucesso. \n" + message);

    }

}
