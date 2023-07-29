package mapsAssignment;

import java.util.Comparator;

public class AreaComparator implements Comparator<Country> {

	    @Override
public int compare(Country country1, Country country2) {
return Double.compare(country1.getArea(), country2.getArea());
	    }
	}



