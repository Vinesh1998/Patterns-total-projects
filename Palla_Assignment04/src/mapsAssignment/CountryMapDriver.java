package mapsAssignment;

public class CountryMapDriver {
	    public static void main(String[] args) {
	        CountryMap cMap = new CountryMap();

	        cMap.addCountry("USA", "Washington DC", 9834000.0, 328200000);
	        cMap.addCountry("China", "Beijing", 9597000.0, 1393000000);
	        cMap.addCountry("India", "New Delhi", 3287000.0, 1366000000);
	        cMap.addCountry("Russia", "Moscow", 17125000.0, 146700000);
	        cMap.addCountry("Brazil", "Brasília", 8515767.0, 213800000);

	        cMap.displayCountry("USA");
	        cMap.displayCountry("China");
	        cMap.displayCountry("India");
	        cMap.displayCountry("Russia");
	        cMap.displayCountry("Brazil");
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

	        System.out.println("Removing country Russia and searching for it");
	        cMap.removeCountry("Russia");
	        cMap.displayCountry("Russia");
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

	        long totalPopulation = cMap.getTotalPopulation();
	        System.out.println("Total population: " + totalPopulation);
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

	        Country largestCountry = cMap.getLargestCountry();
	        System.out.println("Largest country: " + largestCountry.getName() + " (" + largestCountry.getArea() + ")");
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        
	        System.out.println("Countries by population:");
	        cMap.displayCountriesByPopulation();
	        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

	        System.out.println("Countries by area:");
	        cMap.displayCountriesByArea();
	    }
	}



