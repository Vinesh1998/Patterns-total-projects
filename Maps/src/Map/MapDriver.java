package Map;
import java.util.*;

public class MapDriver
		{
public static void main(String[] args)
			{
TreeMap<String,String> stateCodes = new TreeMap<String,String>();
				
stateCodes.put("Missouri", "MO");
stateCodes.put("Texas", "TX");
stateCodes.put("California", "CA");
stateCodes.put("New York", "NY");
				
System.out.println("The code for Texas is "+ stateCodes.get("Texas"));

System.out.println("States: " + stateCodes.keySet());

System.out.println("Codes: " + stateCodes.values());

System.out.println("Mappings: " + stateCodes.entrySet());
System.out.println(stateCodes.size());			
stateCodes.remove("New York");
System.out.println("Mappings: " + stateCodes.entrySet());
System.out.println("updated size is "+stateCodes.size());

			}
	

		


	}


