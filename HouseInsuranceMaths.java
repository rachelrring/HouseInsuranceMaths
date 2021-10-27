
package appskillsdemo1;

public class HouseInsuranceMaths {
    
    //static method to calculate the price of the house
    public static double getPrice(int rms,int wndws, int strs, double wdth, double lngth){
        double price,area;
        area = wdth * lngth;
        price = area*rms*wndws*strs;
        return price;
    }
    
    //static method to calculate the insurance cost of the house
    public static double getInsurancePrice(double price){
        double insuranceCost;
        final double insPerc = .02;
        insuranceCost = price*insPerc;
        return insuranceCost;
    }
    
    //static method to calculate the rental price
    public static double getRentalPrice(double price){
        double rentalPrice;
        final int rentRate =400;
        rentalPrice = price/rentRate;
        return rentalPrice;
    }
}
