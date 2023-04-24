package org.example.provider;

import org.example.service.Currency;

public class SwedishCurrency implements Currency {
    public SwedishCurrency() {

        System.out.println("Swedish currency created");


    }

    @Override
    public String convertThis() {
        return "SEK";
    }
}
