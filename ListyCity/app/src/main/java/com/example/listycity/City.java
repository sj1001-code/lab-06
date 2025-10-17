package com.example.listycity;

import java.util.Objects;

public class City implements Comparable<City> {
    private String cityName;
    private String provinceName;

    public City(String cityName, String provinceName) {
        this.cityName = cityName;
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    @Override
    public int compareTo(City city) {
        // sort alphabetically by city name
        return this.cityName.compareTo(city.getCityName());
    }

    //  added equals() to compare by city name + province
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityName.equals(city.cityName) &&
                provinceName.equals(city.provinceName);
    }

    // added hashCode() for consistency with equals()
    @Override
    public int hashCode() {
        return Objects.hash(cityName, provinceName);
    }

    @Override
    public String toString() {
        return cityName + ", " + provinceName;
    }
}
