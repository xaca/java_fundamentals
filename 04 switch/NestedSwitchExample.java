/*
 *  A program to demonstrate Nested switch statements
 *  Input is an integer year {1,2,3} and character branch {A,B,C} 
 *  Output would be the classes that they would undergo for the year
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedSwitchExample
{
    public static void main(String arg[]) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int year = Integer.parseInt(br.readLine());
    	char branch = br.readLine().toUpperCase().charAt(0);
        
        switch( year )
        {
            case 1:
                System.out.println("English, Maths, Drawing, Basic Sciene");
                break;
            case 2:
                switch( branch ) 
                {
                    case 'A':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'B':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'C':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                    default :
                    	System.out.println("Branch doesn't exist");
                }
                break;
            case 3:
                switch( branch ) 
                {
                    case 'A':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'B':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'C':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                    default :
                    	System.out.println("Branch doesn't exist");
                }
                break;
            default :
            	System.out.println("Year doesn't exist");
        }
    
    }
}
