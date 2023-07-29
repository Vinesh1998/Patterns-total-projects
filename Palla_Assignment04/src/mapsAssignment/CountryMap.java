package mapsAssignment;
import java.util.*;

public class CountryMap {
	    private Map<String, Country> nameToCountryMap;

	    public CountryMap() {
	        nameToCountryMap = new HashMap<>();
	    }

	    public void addCountry(String name, String capital, double area, long population) {
	        Country country = new Country(name, capital, area, population);
	        nameToCountryMap.put(name, country);
	    }

	    public void removeCountry(String name) {
	        nameToCountryMap.remove(name);
	    }

	    public void displayCountry(String name) {
	        Country country = nameToCountryMap.get(name);
	        if (country == null) {
	            System.out.println("Country not found.");
	        } else {
	            System.out.println(country);
	        }
	    }

	    public long getTotalPopulation() {
	        long totalPopulation = 0;
	        for (Country country : nameToCountryMap.values()) {
	            totalPopulation += country.getPopulation();
	        }
	        return totalPopulation;
	    }

	    public Country getLargestCountry() {
	        Country largestCountry = null;
	        for (Country country : nameToCountryMap.values()) {
	            if (largestCountry == null || country.getArea() > largestCountry.getArea()) {
	                largestCountry = country;
	            }
	        }
	        return largestCountry;
	    }

	    public void displayCountriesByPopulation() {
	        List<Country> countries = new ArrayList<>(nameToCountryMap.values());
	        Collections.sort(countries, new PopulationComparator());
	        for (Country country : countries) {
	            System.out.println(country.getName() + " - " + country.getPopulation());
	        }
	    }

	    public void displayCountriesByArea() {
	        List<Country> countries = new ArrayList<>(nameToCountryMap.values());
	        Collections.sort(countries, new AreaComparator());
	        for (Country country : countries) {
	            System.out.println(country.getName() + " - " + country.getArea());
	        }
	    }
	}


