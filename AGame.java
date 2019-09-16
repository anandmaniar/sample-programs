1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.



abstract class Game
{
  abstract void play();	
}
class Cricket extends Game
{

	@Override
	public void play() 
	{
		System.out.println("Playing Cricket ");
	}
}
class FootBall extends Game
{

	@Override
	public void play() 
	{
		System.out.println("Playing FootBall ");
	}
}
class Tennis extends  Game
{

	@Override
	public void play()
	{
		System.out.println("Playing Tennis ");
	}
}

public class AGame {
public static void main(String[] args) {
	int i;
	Game arr[]=new Game[4];
	
	arr[0] = new Cricket();
	arr[1]= new FootBall();
	arr[2]= new Tennis();
	
	for(i=0;i<arr.length;i++)
	{
		if(arr[i] instanceof Cricket)
		{
			arr[i].play();
		}  
	}	
}
}