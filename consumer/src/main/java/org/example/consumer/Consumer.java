package org.example.consumer;
import org.example.service.Converter;
import org.example.service.annotation.Currency;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ServiceLoader;


public class Consumer {


    private static final List<String> menuOptions = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        loadMenuOptions();



        while (true) {
            printMenu();
            int action = sc.nextInt();
            sc.nextLine();
            if (action == 0) break;
            String currency = menuOptions.get(action - 1);
            System.out.println("Enter the amount of SEK you want to convert to " + currency);
            var value = sc.nextBigDecimal();
            var c = getConverter(currency).get();
            var convertedValue = c.convert(value);
            System.out.printf("%s SEK is %s %s", value.setScale(2).toPlainString(), convertedValue.setScale(2).toPlainString(), currency);
        }
    }




    private static void printMenu() {
        System.out.println();
        System.out.println();
        System.out.println("Choose what currency you want to convert your SEK into");
        System.out.println("=======================================================");
        System.out.println("0. Quit application");
        for (String currency : menuOptions) {
            System.out.printf("%d. %s%n", menuOptions.indexOf(currency) + 1, currency);
        }
        System.out.println("=======================================================");

    }

    private static void loadMenuOptions() {

        var converters = getConverters();
        for (var converter : converters) {
            var anno = converter.getClass().getAnnotation(Currency.class);
            if (anno != null) {
                menuOptions.add(anno.value());
            }
        }

    }


    private static ServiceLoader<Converter> getConverters() {
        return ServiceLoader.load(Converter.class);
    }

    private static ServiceLoader.Provider<Converter> getConverter(String currency) {
        return getConverters().stream().filter(converterProvider -> {
            var anno = converterProvider.type().getAnnotation(Currency.class);
            return currency.equals(anno.value());
        }).findFirst().orElse(null);
    }
}
