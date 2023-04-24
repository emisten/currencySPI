package org.example.consumer;

import org.example.service.Currency;
import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {

        ServiceLoader<Currency> currencies = ServiceLoader.load(Currency.class);

        for ( var currency : currencies) {
            System.out.println(currency.convertThis());
        }
    }
}
