package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CountryService {


    public final ApplicationContext context=new ClassPathXmlApplicationContext("Country.xml");

    public Country getCountry(String code){
        String [] beans=context.getBeanDefinitionNames();
        for(String bean:beans){
            Object obj=context.getBean(bean);
            if(obj instanceof Country country){
                if(country.getCode().equalsIgnoreCase(code)){
                    return country;
                }
            }
        }
        return null;
    }

}
