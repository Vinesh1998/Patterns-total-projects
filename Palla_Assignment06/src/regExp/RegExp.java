package regExp;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    
    public static void TestRegExp(String s, String r) {
        Pattern p = Pattern.compile(r);
        Matcher m = p.matcher(s);
        int i = 1;
        while (m.find()) {
            System.out.println(i + ") " + m.group() + " is found at index " + m.start());
            i++;
        }
    }
    
    public static void main(String[] args) {
        String s1 ,r1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter String");
        s1=scan.next();
        System.out.println("Enter Regular exp pattern:");
        r1=scan.next();
        System.out.println(s1);
        TestRegExp(s1, r1);
        
       
    }
}
