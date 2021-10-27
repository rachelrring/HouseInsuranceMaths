# HouseInsuranceMaths

This project was created for QQI level 6 for object oriented programming through Java

Create a program that uses two classes outside of the program (main) class. (Created in the same package)
The first class:
  - A static maths class, named HouseInsuranceMaths.
  - Must contain at least three methods.
        			A method to return a cost of a house based on the area (floor area of the house, if two stories you must double this, three triple and so on) and amount of windows and rooms. Price = (floor area * rooms*rooms   * windows*Stories).
        			A method to calculate the price of insurance, this is .02% of the price of the house, to get the price of the house this method must use the first method.
        			A method to calculate the price of rental per month, this is the price of the house divided by 400.

Second Class, non-static instance(s) of this class will be called in the main program.
  - A class, named House.
  - Must be a class that defines a house.
  - Use at least 8 properties that will define a house.
				Required properties are:	
					Width
					Length
					Stories
					Windows
					Rooms 
			Create appropriate methods for all the above properties.
  - Create three methods that return values calculated in the static class HouseInsuranceMaths.
				GetPrice()
				GetRentalPrice()
				GetInsurancePremium()
  - Where applicable use classes already created in this assignment to calculate the price.



The program must create an instance of a house.
The program askes the user to enter the above details.
The program should then display the price, rental amount and insurance premium along with every house detail (properties), in an attractive screen. 
House information should be taken from the instance of the house, not local class variables. 
Include graphics (lines and stars) in the Console Application

