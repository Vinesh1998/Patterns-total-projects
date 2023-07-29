package mapsAssignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	    private Map<String, String> word2Def;

	   

	    public void addWordToDictionary(String word, String def) {
	    	word2Def.put(word.toLowerCase(), def);
	    }
	    public String getDefinition(String word) {
	        return word2Def.getOrDefault(word.toLowerCase(), word+" not  in the dictionary.");
	    }
	    public Dictionary() {
	    	word2Def = new HashMap<>();
	    }

	    public static void main(String[] args) {
	        Dictionary d = new Dictionary();
	        d.start();
	    }

	    public void start() {
	        Scanner scan = new Scanner(System.in);
	        String word = "";
	        while (!word.equals("q")) {
	            System.out.print("Enter a word (or 'q' to quit): ");
	            word = scan.nextLine();
	            if (!word.equals("q")) {
	                System.out.print("Enter the definition: ");
	                String definition = scan.nextLine();
	                addWordToDictionary(word, definition);
	            }
	        }

	        String searchWord = "";
	        while (!searchWord.equals("q")) {
	            System.out.print("Enter a word to search for (or 'q' to quit): ");
	            searchWord = scan.nextLine();
	            if (!searchWord.equals("q")) {
	                System.out.println(getDefinition(searchWord));
	            }
	        }
	        scan.close();

	    }

	    
	}


