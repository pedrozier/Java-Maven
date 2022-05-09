package com.standart;

import com.standart.kafka.events.MyEventProducer;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();

    }

    private void start() {
        System.out.println("Iniciando...");
        MyEventProducer producer = new MyEventProducer();
        producer.sendMessage();
    }
}
