package org.example.service;

import java.math.BigDecimal;

public interface Converter {
    BigDecimal convert(BigDecimal amountInSek);
}
