
package appskillsdemo1;
import java.util.Scanner;

public class AppSkillsDemo1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //object 1: House1: pre set properties to check the methods functionality
        House House1 = new House();
        House1.setLength(100);
        House1.setWidth(100);
        House1.setBackGarden(true);
        House1.setDoors(20);
        House1.setFrontGarden(true);
        House1.setRooms(10);
        House1.setStories(3);
        House1.setWindows(10);      
        System.out.println(House1.toString());
        
        //object2: H1: testing using user input
        House H1 = new House();
        System.out.println("What is the length of the property (meters): ");
        H1.setLength(input.nextDouble());
        System.out.println("What is the Width of the property (meters): ");
        H1.setWidth(input.nextDouble());
        System.out.println("How many rooms does the house have:");
        H1.setRooms(input.nextInt());
        System.out.println("How many windows does the property have: ");
        H1.setWindows(input.nextInt());
        System.out.println("How many stories does the property have: ");
        H1.setStories(input.nextInt());
        System.out.println("How many doors does the property have: ");
        H1.setDoors(input.nextInt());
        System.out.println("Does the property have a front garden: ");
        H1.setFrontGarden(input.nextBoolean());
        System.out.println("Does the property have a back garden: ");
        H1.setBackGarden(input.nextBoolean());
        System.out.println(H1.toString());
        
        //object 3: H2: testing the createHouse method
        House H2 = new House();
        H2.createHouse();
        System.out.println(H2.toString());
        
        //object4: H3: testing the attarctive screen method 
        House H3 = new House();
        H3.createHouse();
        H3.attractiveScreen();
        
        
        
        
    }
    
}
