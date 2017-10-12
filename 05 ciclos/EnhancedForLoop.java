import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A really simple enhanced for loop example.
 */
public class EnhancedForLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fruitList = new ArrayList<>();

        System.out.println("Enter some fruits!");
        // basic for loop
        for (int i = 0; i < 3; i++) {
            fruitList.add(scanner.next());
        }

        System.out.println("You entered the following fruits:");
        // enhanced for loop
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }
}
