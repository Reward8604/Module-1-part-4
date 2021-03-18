package com.techelevator;

public class HomeworkAssignment 
{
	private  int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	
	//Constructors
	
	public HomeworkAssignment (int possibleMarks, String submitterName)
	{
		this.possibleMarks = possibleMarks;
		this.submitterName = submitterName;
	}
	
	//Methods
	
	public String getLetterGrade ()
	{
		double percentage = this.earnedMarks / (double)this.possibleMarks;
		
		if (percentage >= 0.9) 
		{
            return "A";
        } 
        
		if (percentage >= 0.8) 
        {
            return "B";
        }
        
		if (percentage >= 0.7) 
		{
            return "C";
        }
        
		if (percentage >= 0.6) 
		{
            return "D";
        }
		else 
		{
            return "F";
        }
	}
	
	
	//Getters
	public int getEarnedMarks()
	{
		return this.earnedMarks;
	}
	
	public int getPossibleMarks()
	{
		return this.possibleMarks;
	}
	
	public String getSubmitterName()
	{
		return this.submitterName;
	}
	
	
	// Setters
	
	public void setEarnedMarks(int earnedMarks)
	{
		 this.earnedMarks = earnedMarks;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
