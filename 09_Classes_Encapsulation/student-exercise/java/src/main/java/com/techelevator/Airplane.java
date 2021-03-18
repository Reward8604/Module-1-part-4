package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Airplane 
{
	
	private String planeNumber;
	private int totalCoachSeats;
	private int bookedCoachSeats;
	private int totalFirstClassSeats; 
	private int bookedFirstClassSeats;
	 
	 
	 //Constuctors
	 
	 public Airplane(String planeNumber, int totalFirstClassSeats,  int totalCoachSeats)
	 {
		 this.planeNumber = planeNumber;
		 this.totalFirstClassSeats = totalFirstClassSeats;
		 this.totalCoachSeats = totalCoachSeats;
	 }
	 
	 //Methods
	 
	 public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) 
	 {
		 if(forFirstClass)
		 {
			if(getAvailableFirstClassSeats()>= totalNumberOfSeats)
			{
				this.bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			}
			else
			{
				return false;
			}
		 }
			 
		 else
		 {
			 if(getAvailableCoachSeats()>= totalNumberOfSeats)
			 {
				 this.bookedCoachSeats += totalNumberOfSeats;
				 return true;
			 }
			 else
			 {
				 return false;
			 }
		 }
		 
		 
	 }
	 
		 //Getters 
		 
	public int getAvailableFirstClassSeats() 
	{
		return this.totalFirstClassSeats - this.bookedFirstClassSeats;
	}
	
	public int getAvailableCoachSeats()
	{
		return this.totalCoachSeats -  this.bookedCoachSeats;
	}
	
	public String getPlaneNumber()
	{
		return this.planeNumber;
	}
	
	public int getTotalCoachSeats()
	{
		return this.totalCoachSeats;
	}
	
	public int getBookedCoachSeats()
	{
		return this.bookedCoachSeats;
	}
	
	public int getTotalFirstClassSeats()
	{
		return this.totalFirstClassSeats;
	}
	
	public int getBookedFirstClassSeats()
	{
		return this.bookedFirstClassSeats;
	}
	
	

	 
	
}


//Instance variables

//| Attribute | Data Type | Get | Set | Description | | ------------------------------------ | --------- | --- | --- | ----------------------------------------------- | | planeNumber | string | X | | The six-character plane number. | | totalFirstClassSeats | int | X | | The total number of first class seats. | | bookedFirstClassSeats | int | X | | The number of already booked first class seats. | | availableFirstClassSeats(derived)| int | X | | The number of available first class seats. | | totalCoachSeats | int | X | | The total number of coach seats. | | bookedCoachSeats | int | X | | The number of already booked coach seats. | | availableCoachSeats(derived) | int | X | | The number of available coach seats. |

//Notes
//•availableFirstClassSeats is a derived value calculated by subtracting bookedFirstClassSeats from totalFirstClassSeats
//•availableCoachSeats is a derived value calculated by subtracting bookedCoachSeats from totalCoachSeats

//Constructors

//Create a constructor for this class that accepts three parameters: String planeNumber, int totalFirstClassSeats, and int totalCoachSeats. Use these parameters to set the properties of the class:
//•planeNumber is the plane number assigned to the airplane.
//•totalFirstClassSeats is the initial number of total first class seats.
//•totalCoachSeats is the initial number of total coach seats.

//Methods

//Create a method called reserveSeats that returns a boolean and accepts two parameters: a boolean called forFirstClass and an int called totalNumberOfSeats.
//•If forFirstClass is true, add totalNumberOfSeats to the value for BookedFirstClassSeats.
//•If forFirstClass is false, add totalNumberOfSeats to the value for BookedCoachSeats.
//•It returns true if there were enough seats to make the reservation, otherwise it returns false.
