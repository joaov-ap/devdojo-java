package dev.joaov.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeSwitzerland = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja", "JP");
        Locale localeNetherlands = new Locale("nl", "NL");
        Locale localeBrazil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeSwitzerland);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeNetherlands);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);

        System.out.println("Italia "+df1.format(calendar.getTime()));
        System.out.println("Suica "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japao "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));
        System.out.println("Brasil "+df6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeJapan));
        System.out.println(localeJapan.getDisplayCountry(localeBrazil));
        System.out.println(localeBrazil.getDisplayCountry(localeNetherlands));
    }
}
