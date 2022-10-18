package com.mitso.spring.generator;
import java.util.Random;
/**
 * Produces an alphanumeric string.
 */
public class Calculator implements StringGenerator {
    private double a = 0,c = 0;
    private String b;
    private double D;
    public Calculator(double a, String b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String generate() {
        StringBuilder result = new StringBuilder();
        switch(b){
            case "+":
                result.append(a+c);
                break;
            case "-":
                result.append(a-c);
                break;
            case "/":
                if (c == 0){
                    result.append("Деление на ноль");
                }else{
                    result.append(a/c);
                }
                break;
            case "*":
                result.append(a*c);
                break;
        }

        return result.toString();
    }
}