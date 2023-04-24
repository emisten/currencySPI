import org.example.provider.ChineseCurrency;
import org.example.provider.SwedishCurrency;
import org.example.provider.UnitedStatesCurrency;
import org.example.service.Currency;

module org.example.provider {
    requires org.example.service;

    provides Currency with SwedishCurrency, UnitedStatesCurrency, ChineseCurrency;

}