package com.mitso.spring.service;
import com.mitso.spring.generator.StringGenerator;
import java.util.ArrayList;
import java.util.List;
public class GeneratorService {
    private StringGenerator stringGenerator;
    // Default constructor is needed if dependency injection is going to be performed via setters
    public GeneratorService() {
    }
    public GeneratorService(StringGenerator stringGenerator) {
        this.stringGenerator = stringGenerator;
    }
    public List<String> generateStrings() {
        List<String> strings = new ArrayList<>();
        strings.add(stringGenerator.generate());
        return strings;
    }

    public StringGenerator getStringGenerator() {
        return stringGenerator;
    }
    public void setStringGenerator(StringGenerator stringGenerator) {
        this.stringGenerator = stringGenerator;
    }
}