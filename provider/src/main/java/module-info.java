
import org.example.provider.ChineseConverter;
import org.example.provider.DanishConverter;
import org.example.provider.UnitedStatesConverter;
import org.example.service.Converter;

module org.example.provider {

    requires org.example.service;

    exports org.example.provider;

    provides Converter with DanishConverter, UnitedStatesConverter, ChineseConverter;

}