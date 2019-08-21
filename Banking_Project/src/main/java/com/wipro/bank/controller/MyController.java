package com.wipro.bank.controller;

import com.wipro.bank.model.City;
import com.wipro.bank.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private CityRepository cityRepository;

    @PostMapping(path = "/add")
    @ResponseBody
    public String addUser(@RequestParam String name, @RequestParam int population) {

        City userCity = new City();
        userCity.setName(name);
        userCity.setPopulation(population);
        String ret = "User city has been added, city name = " + name + ", population = " + population;
        cityRepository.save(userCity);
        return ret;
    }
    
	@GetMapping(path="/all")
	public @ResponseBody Iterable<City> getAllCities() {
		// This returns a JSON or XML with the users
		return cityRepository.findAll();
	}
}