public class Game 
{

	int count=0;
	int chance[]= new int[21];
	//Function to receive the array of pins down. It takes array as input parameter
	public void Roll(int... pinsDownArray) // array of the score of the bowling game is sent from the ApptestCases.java
	{
		for(int i=0; i<pinsDownArray.length;i++) //func to insert the value into the array 
			Roll(pinsDownArray[i]);		
	}
	
	//Function to insert the pins down into array for further use in the Score function to return the total value
	public void Roll(int pins) // pins are inserted into the array
	{
		chance[count++]=pins;
	}
	
	
	//Function to return the total score of the bowling game by comparing spare/strike and updating the new result	
	public int Score() {
		int score=0;
		int pointer=0;
		
		for (int frame=0; frame<10; frame++)  // Number of frames is 10
		{
			if (chance[pointer]==10)     //If its a Strike , add the score of next 2 chances
			{
				score+=10+chance[pointer+1]+chance[pointer+2];
				pointer++;
			}
			else if (isSpare(pointer))  //If its a Spare. Add the score of next 1 chances
			{
				score+=10+chance[pointer+2];
				pointer+=2;
			}
			
			else                    //If its a normal chance
			{
				score+=chance[pointer]+chance[pointer+1];
				pointer+=2;
			}
		}
		
		//System.out.println(chance);
		
		System.out.println("Total Score for above Pins is :"+score);
		
		return score;
		}
	
boolean isSpare(int pointer)  // to check weather the frame is a spare
{
	return chance[pointer]+chance[pointer+1]==10;
}


}

