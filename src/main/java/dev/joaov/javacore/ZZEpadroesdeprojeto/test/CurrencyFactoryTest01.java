package dev.joaov.javacore.ZZEpadroesdeprojeto.test;

import dev.joaov.javacore.ZZEpadroesdeprojeto.dominio.Country;
import dev.joaov.javacore.ZZEpadroesdeprojeto.dominio.Currency;
import dev.joaov.javacore.ZZEpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
