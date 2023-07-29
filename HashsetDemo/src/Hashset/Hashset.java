package Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
     cars.add("Audi");
     cars.add("Bmw");
     //cars.add("Audi");
     //cars.add("Audi");
     cars.add("Gmc");
     cars.add("Ford");
     System.out.println("Hashset :"+cars);
     System.out.println("Hashset size:"+cars.size());
     Iterator<String> iter = cars.iterator();
     while (iter.hasNext())
     {
        System.out.println(iter.next());
     }
  
     cars.clear();
     System.out.println("updated Hashset :"+cars);
     TreeSet<String> Owners = new TreeSet<String>();
     Owners.add("Vinesh");
     Owners.add("Pranay");
     Owners.add("Shiva");
     Owners.add("Pranay");
     Owners.add("Ajay");
     Owners.add("Pandu");
     System.out.println("Treeset :"+Owners);
     Iterator<String> iter1 = Owners.iterator();
     while (iter.hasNext())
     {
        System.out.println(iter.next());
     }
     System.out.println("Treeset size :"+Owners.size());
     Owners.clear();
     System.out.println("Updated Treeset :"+Owners);
     LinkedHashSet<String> Rental = new LinkedHashSet<String>();
     Rental.add("P");
     Rental.add("A");
     Rental.add("N");
     Rental.add("D");
     Rental.add("U");
     Rental.add("P");
     System.out.println("LinkedHashset :"+Rental);
     Iterator<String> iter02 = Rental.iterator();
     while (iter02.hasNext())
     {
        System.out.println(iter02.next());
     }
     System.out.println("LinkedHashset size:"+Rental.size());	
     Rental.clear();
     System.out.println("Updated LinkedHashset :"+Rental);
     
     
	}

}
