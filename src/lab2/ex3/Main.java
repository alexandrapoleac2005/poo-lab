package lab2.ex3;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // tipuri primitive - intregi
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("Adunam o cantitate intreaga la maximul fiecarui tip primitiv intreg:");
        System.out.println("BYTE: " + (byte)(maxByte+1));
        System.out.println("SHORT: " + (short)(maxShort+1));
        System.out.println("INT: " + (int)(maxInt+1));
        System.out.println("LONG: " + (long)(maxLong+1));

        System.out.println();

        System.out.println("Scadem o cantitate intreaga din minimul fiecarui tip primitiv intreg:");
        System.out.println("BYTE: " + (byte)(minByte-1));
        System.out.println("SHORT: " + (short)(minShort-1));
        System.out.println("INT: " + (int)(minInt-1));
        System.out.println("LONG: " + (long)(minLong-1));

        System.out.println();

        // tipuri primitve - numere in virgula flotanta
        System.out.println("Inmultim un numar supraunitar cu maximul float-ului/ double-ului:");
        float maxFloat = Float.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        System.out.println("FLOAT: " + maxFloat * 1.1f);
        System.out.println("DOUBLE: " + maxDouble * 1.1);

        System.out.println();

        // Utilizam clasa BigDecimal

        System.out.println("Afisam numar care are mai multe zecimale decat maximul reprezentabil:");
        BigDecimal bigDecimal = new BigDecimal("0.123456789123456789");
        // e un numar care nu poate fi reprezentat nici ca float nici ca double, are 18 cifre dupa virgula
        System.out.println(bigDecimal);

        System.out.println();

        System.out.println("Suma a doua numere de tipul Big Decimal:");
        BigDecimal bigDecimal2 = new BigDecimal("1");
        BigDecimal suma= bigDecimal.add(bigDecimal2);
        System.out.println(suma);

    }
}
