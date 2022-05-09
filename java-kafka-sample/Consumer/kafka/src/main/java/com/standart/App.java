package com.standart;

import com.standart.kafka.events.MyEventConsumer;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();

    }

    private void start() {
        System.out.println("Iniciando...");
        MyEventConsumer consumer = new MyEventConsumer();
        consumer.executar();
    }
}
