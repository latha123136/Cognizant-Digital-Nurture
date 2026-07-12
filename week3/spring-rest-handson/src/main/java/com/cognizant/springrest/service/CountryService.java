package com.cognizant.springrest.service;

import com.cognizant.springrest.bean.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry(String code) {

        if(code.equalsIgnoreCase("IN"))
            return (Country) context.getBean("countryIndia");

        if(code.equalsIgnoreCase("US"))
            return (Country) context.getBean("countryUSA");

        if(code.equalsIgnoreCase("JP"))
            return (Country) context.getBean("countryJapan");

        return null;
    }
}