
package appskillsdemo1;

import java.util.Scanner;

public class House {
    //Scanner object: input: used in the creatHouse() method to accept user input
    Scanner input = new Scanner(System.in);
    
    /*8 properties that define a house - variable within the House class
    All properties have been set as private*/
    private double width , length;
    private int rooms, windows, stories, doors;
    private boolean frontGarden , backGarden;
    
    //default constructor for each variable in the class
    public House(){
        this.width = 0;
        this.length = 0;
        this.rooms = 0;
        this.windows = 0;
        this.stories = 0;
        this.doors = 0;
        this.frontGarden = false;
        this.backGarden = false;
    }
    
    //getters and setters for each variable in the class
    public void setWidth(double wdth){
        this.width = wdth;
    }
    public double getWidth(){
        return this.width;
    }
    public void setLength(double lngth){
        this.length = lngth;
    }
    public double getLength(){
        return this.length;
    }
    public void setRooms(int rms){
        this.rooms = rms;
    }
    public int getRooms(){
        return this.rooms;
    }
    public void setWindows(int wndws){
        this.windows = wndws;
    }
    public int getWindows(){
        return this.windows;
    }
    public void setStories(int strs){
        this.stories = strs;
    }
    public int getStories(){
        return this.stories;
    }
    public void setDoors(int drs){
        this.doors = drs;
    }
    public int getDoors(){
        return this.doors;
    }
    public void setFrontGarden(boolean front){
        this.frontGarden = front;
    }
    public boolean getFrontGarden(){
        return this.frontGarden;
    }
    public void setBackGarden(boolean back){
        this.backGarden = back;
    }
    public boolean getBackGarden(){
        return this.backGarden;
    }
    
    //method to get price of the house: return type;Double
    public double getPrice(){
        double price;
        price = HouseInsuranceMaths.getPrice(this.rooms, this.windows, this.stories, this.width, this.length);
        return price;
    }
    //method to get price of the Rent: return type;Double   
    public double getRentalPrice(){
        double rentalPrice;
        rentalPrice = HouseInsuranceMaths.getRentalPrice(this.getPrice());
        return rentalPrice;
    }
    //method to get price of the Insurance: return type;Double
    public double getInsurancePremium(){
        double insurancePremium;
        insurancePremium = HouseInsuranceMaths.getInsurancePrice(this.getPrice());
        return insurancePremium;
    }
    //method to create a new object of house 
    public void createHouse(){
        System.out.println("What is the length of the property (meters): ");
        this.setLength(input.nextDouble());
        System.out.println("What is the Width of the property (meters): ");
        this.setWidth(input.nextDouble());
        System.out.println("How many rooms does the house have:");
        this.setRooms(input.nextInt());
        System.out.println("How many windows does the property have: ");
        this.setWindows(input.nextInt());
        System.out.println("How many stories does the property have: ");
        this.setStories(input.nextInt());
        System.out.println("How many doors does the property have: ");
        this.setDoors(input.nextInt());
        System.out.println("Does the property have a front garden: ");
        this.setFrontGarden(input.nextBoolean());
        System.out.println("Does the property have a back garden: ");
        this.setBackGarden(input.nextBoolean());
    }
    //Method that prints out all the properties of the object
    @Override// overrideen because java already has a toString method
    public String toString(){
        return "Width: "+this.width+"\nLength: "+this.length+"\nStories: "+this.stories
                +"\nWindows: "+this.windows+"\nRooms: "+this.rooms+"\nDoors: "+this.doors
                +"\nFrontGarden: "+this.frontGarden+"\nBackgarden: "+this.backGarden
                +"\nHouse Price: €"+this.getPrice()+"\nHouse Rent: €"+this.getRentalPrice()
                +"\nInsurance Cost: €"+this.getInsurancePremium();
    }
     
    //Method to Print out an attractive Screen with all the House Details 
    public void attractiveScreen(){
        int line = 2 ;
        int i;
        
        for (i = 0; i<line; i++){
        System.out.println("*****************************************");
        }
        System.out.println("*         House Calculations            *");
        for (i = 0; i<line; i++){
        System.out.println("*****************************************");
        }
        System.out.println("         Price of House:"+this.getPrice()+
                "            \n        Price of Insurance: "+this.getInsurancePremium()+
                "        \n       Rental Price per month: "+this.getRentalPrice());
        for (i = 0; i<line; i++){
        System.out.println("*****************************************");
        }
        System.out.println("Width: "+width+"    Length: "+length+"  Stories: "+stories
                +"\nWindows: "+windows+"    Rooms: "+rooms+"    Doors: "+doors
                +"\nFrontGarden: "+frontGarden+"   Backgarden: "+backGarden);
        for (i = 0; i<line; i++){
        System.out.println("*****************************************");
        }
    }
}
    
