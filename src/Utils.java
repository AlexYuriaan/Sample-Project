import java.util.Scanner;
public class Utils {
    
    public static String getUserInput_String() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter a String: ");
        String n = reader.nextLine(); 
        //once finished
        reader.close();
        return n;
    }

    public static int getUserInput_int() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter a Number: ");
        int n = reader.nextInt(); 
        //once finished
        reader.close();
        return n;
    }

    public static double getUserInput_double() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Enter a Number: ");
        double n = reader.nextDouble(); 
        //once finished
        reader.close();
        return n;
    }

    

    
}
