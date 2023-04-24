package org.example.provider;

import org.example.service.Currency;

public class UnitedStatesCurrency implements Currency {
    public UnitedStatesCurrency() {
        System.out.println("US currency created");

    }

    @Override
    public String convertThis() {
        return "USD";
    }
}
