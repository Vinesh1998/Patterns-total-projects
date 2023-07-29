package regExp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpOverlap {
    
    public static void TestRegExpOverlap(String s, String r) {
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        int i = 1;
        while (m.find()) {
            System.out.println(i + ") " + m.group() + " is found at index " + m.start());
            int startIndex = m.start() + 1;
            m.region(startIndex, s.length());
            while (m.find()) {
                System.out.println(i + ") " + m.group() + " is found at index " + m.start());
            }
            i++;
        }
    }
    
    public static void main(String[] args) {
    	   String s ,r;
           Scanner scan=new Scanner(System.in);
           System.out.println("Enter String");
           s=scan.next();
           System.out.println("Enter Regular exp pattern:");
           r=scan.next();
           System.out.println(s);
           TestRegExpOverlap(s, r);
        
    }
}


