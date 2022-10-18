package com.mitso.spring.generator;
/**
 * Provides functionality to produce string
 */
public interface StringGenerator {
    String EMPTY_STRING = "";
    /**
     * Generates string with random characters.
     *
     * @param a result string length
     * @param b result string length
     * @param c result string length
     * @return generated string
     */
//    String generate(int a, int b, int c);
    String generate();
}