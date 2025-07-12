package com.example.countryservice;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Map<String, String> countries = new HashMap<>();
    static {
        countries.put("IN", "India");
        countries.put("US", "United States");
    }

    @GetMapping("/{code}")
    public String getCountry(@PathVariable String code) {
        return countries.getOrDefault(code.toUpperCase(), "Country not found");
    }
}