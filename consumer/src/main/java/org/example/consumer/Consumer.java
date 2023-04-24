package org.example.consumer;
import org.example.service.Converter;
import org.example.service.annotation.Currency;
import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args){


        ServiceLoader<Converter> converters = ServiceLoader.load(Converter.class);

        System.out.println(converters.stream().count());

        for (var c : converters) {
            var anno = (Currency) c.getClass().getAnnotation(Currency.class);
            if (anno != null) {

            }
        }
    }
}

