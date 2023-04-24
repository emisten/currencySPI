package org.example.provider;

import org.example.service.Converter;
import org.example.service.annotation.Currency;

import java.math.BigDecimal;

@Currency("DKK")
public class DanishConverter implements Converter {
    public DanishConverter() {
        System.out.println("Danish currency created");

    }

    @Override
    public BigDecimal convert(BigDecimal amountInSek) {
        return null;
    }
}
