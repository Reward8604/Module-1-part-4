package com.techelevator;

public class Elevator 
{
	
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen = false;
    

    //Constructors
    
    public Elevator( int numberOfLevels) 
    {
        
        this.numberOfFloors = numberOfLevels;
        
    }
    
    //Getters
    
    
    public int getCurrentFloor() 
    {
        return currentFloor;
    }
    
    public int getNumberOfFloors() 
    {
        return numberOfFloors;
    }
    
    public boolean isDoorOpen() 
    {
        return doorOpen;
    }

   
    //Setters
    
    public void openDoor()
    {
        
        {
            doorOpen = true;
        }
    }
    
    public void closeDoor()
    {
       
        {
            doorOpen = false;
        }
    }

    // Methods
    
    public void goUp(int desiredFloor)
    {
        

        if (!doorOpen && desiredFloor > currentFloor && desiredFloor <= numberOfFloors)
        {
        	currentFloor = desiredFloor;
            
        }
       
        
    }
    
    public void goDown(int desiredFloor)
    {
        if (!doorOpen && desiredFloor < currentFloor && desiredFloor >= 1)
        {
            currentFloor = desiredFloor;
            
        }

       
    }
    
}
