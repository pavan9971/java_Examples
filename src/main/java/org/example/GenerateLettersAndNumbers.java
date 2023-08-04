package org.example;
import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.io.IOException;
import java.util.Locale;
import java.util.Random;

public class GenerateLettersAndNumbers {
    public static void main(String[] args) throws IOException {
    FakeValuesService fsv = new FakeValuesService(new Locale("en-IND"),new RandomService());
    String number = fsv.numerify("######");
    String letter=fsv.letterify("?????");
    String custom=fsv.regexify("[a-z0-9]{10}");
    System.out.println(number);
    System.out.println(letter);
    System.out.println(custom);

    }
}
