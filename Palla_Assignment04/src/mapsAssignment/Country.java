package mapsAssignment;

public class Country {

	    private String name;
	    private String capital;
	    private double area;
	    private long population;

	    public Country(String name, String capital, double area, long population) {
	        this.name = name;
	        this.capital = capital;
	        this.area = area;
	        this.population = population;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getCapital() {
	        return capital;
	    }

	    public double getArea() {
	        return area;
	    }

	    public long getPopulation() {
	        return population;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + "\nCapital: " + capital + "\nPopulation: " + population + "\nArea: " + area;
	    }
	}



