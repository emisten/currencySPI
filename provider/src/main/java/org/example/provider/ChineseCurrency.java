package org.example.provider;

import org.example.service.Currency;

public class ChineseCurrency implements Currency {
    public ChineseCurrency() {
        System.out.println("Chinese currency created");
    }

    @Override
    public String convertThis() {
        return "Yuan";
    }
}
