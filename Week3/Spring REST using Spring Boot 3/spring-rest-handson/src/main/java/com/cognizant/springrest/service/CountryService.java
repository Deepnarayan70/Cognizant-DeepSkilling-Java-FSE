package com.cognizant.springrest.service;

import com.cognizant.springrest.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public Country getCountry() {
        return context.getBean("country", Country.class);
    }
}