package com.cognizant.security.service;

import com.cognizant.security.model.Country;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CountryService {
        public List<Country> getCountries(){

            return List.of(new Country("India","IN"),
                    new Country("United States","US"),
                    new Country("Japan","JP"),
                    new Country("China","CN"));
        }

}
