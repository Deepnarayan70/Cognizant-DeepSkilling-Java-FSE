package com.cognizant.springrest.service;

import com.cognizant.springrest.model.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private static List<Country> countryList = new ArrayList<>();

    static {

        Country india = new Country();
        india.setCode("IN");
        india.setName("India");

        Country us = new Country();
        us.setCode("US");
        us.setName("United States");

        Country japan = new Country();
        japan.setCode("JP");
        japan.setName("Japan");

        countryList.add(india);
        countryList.add(us);
        countryList.add(japan);
    }

    public Country getCountry(String code) {

        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }

        return null;
    }
}