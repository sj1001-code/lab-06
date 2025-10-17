package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     * //@throws : IllegalArgumentException if city already exists in the
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Check if the given city exists in the list.
     *
     *@param city they city to check
     *@return true if the city exists in the lists, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes the specified city from the list if it exists.
     *
     * @param city the city to delete
     * @throws IllegalArgumentException if the city does not exist in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in the list.");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities currently in the list.
     *
     * @return the number of cities in the list
     */
    public int countCities() {
        return cities.size();
    }
}