package dev.joaov.javacore.ZZEpadroesdeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:
                return new UsDollar();
            case BRAZIL:
                return new Real();
            default: throw new IllegalArgumentException("No currency fundd for this country");
        }
    }
}
