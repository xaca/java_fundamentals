import java.util.Scanner;

public class TowerOfHanoi {
    /**
     * @param source - Source tube.
     * @param helper - Auxillary tube.
     * @param destination - The tube where we will move the disks to.
     * @param num - Number of disks.
     */
    public static void towerOfHanoi(String source, String helper, String destination, int num) {
        //Base case -> If the number of disk is 1, we will directly move it to destination,
        //There is no need of helper tube in this case
        if (num == 1) {
            System.out.println("Moving from " + source + " to " + destination);
            return;
        }

        //First picking up n-1 disks to helper
        //And then shifting them to the helper using recursion.
        //(1st step)
        towerOfHanoi(source, destination, helper, num - 1);

        //Picking up the last 1 disk and shifting it from source to destination
        //(2nd step)
        System.out.println("Moving from " + source + " to " + destination);

        //Picking up the disks shifted in the 1st step
        // Shifting them to destination from helper to destination using source using recursion.
        towerOfHanoi(helper, source, destination, num - 1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the source");
        String source = s.next();
        System.out.println("Enter the helper");
        String helper = s.next();
        System.out.println("Enter the destination");
        String destination = s.next();
        System.out.println("Enter the number of disks you want to shift from source to destination");
        int num = s.nextInt();
        towerOfHanoi(source,helper,destination,num);

    }
}
