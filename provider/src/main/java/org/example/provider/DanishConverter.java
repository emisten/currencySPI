package org.example.provider;

import org.example.service.Converter;
import org.example.service.annotation.Currency;

import java.math.BigDecimal;

@Currency("DKK")
public class DanishConverter implements Converter {


    @Override
    public BigDecimal convert(BigDecimal amountInSek) {
        return amountInSek.multiply(BigDecimal.valueOf(0.66));
    }
}
