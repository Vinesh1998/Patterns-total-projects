package mapsAssignment;
import java.util.Comparator;
	public class PopulationComparator implements Comparator<Country> {

	    @Override
	    public int compare(Country country1, Country country2) {
	        return Long.compare(country2.getPopulation(), country1.getPopulation());
	    }
	}



