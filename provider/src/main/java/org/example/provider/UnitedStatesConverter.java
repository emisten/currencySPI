package org.example.provider;

import org.example.service.Converter;
import org.example.service.annotation.Currency;

import java.math.BigDecimal;

@Currency("USD")
public class UnitedStatesConverter implements Converter {
    public UnitedStatesConverter() {
        System.out.println("US currency created");

    }
    @Override
    public BigDecimal convert(BigDecimal amountInSek) {
        return null;
    }
}
