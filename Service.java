package com.example.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.HashMap;
import java.util.Map;

@ConfigurationProperties()
public class Service {

    private final Map<Integer, String> countries = new HashMap<>();

    public Map<Integer, String> getCountries() {
        return countries;
    }

}
