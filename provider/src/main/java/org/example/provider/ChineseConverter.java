package org.example.provider;

import org.example.service.Converter;
import org.example.service.annotation.Currency;

import java.math.BigDecimal;

@Currency("CNY")
public class ChineseConverter implements Converter {
    public ChineseConverter() {
        System.out.println("Chinese currency created");
    }

    @Override
    public BigDecimal convert(BigDecimal amountInSek) {
        return null;
    }
}
