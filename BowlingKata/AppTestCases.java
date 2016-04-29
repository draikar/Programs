import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.Test;

public class AppTestCases {

	Game game=new Game();
	@Test
	public void ScoreOfZero()
	{
		game.Roll(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
		assertThat(game.Score(), is(0));
		
		
	}
	
	@Test
	public void ScoreOfOnes()
	{	
		game.Roll(1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
		assertThat(game.Score(), is(20));
		
	}
	
	@Test
	public void ScoreOfSpare()
	{

		game.Roll(5,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1);
		assertThat(game.Score(), is(29));
		
	}
	
	@Test
	public void ScoreOfStrike()
	{
		game.Roll(10,10,10,10,10,10,10,10,10,10,10,10);
		assertThat(game.Score(), is(300));
	}
	
	@Test
	public void ScoreOfFive()
	{	
		game.Roll(5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5);
		assertThat(game.Score(), is(150));
		
	}
	
	@Test
	public void ScoreOfFour()
	{	
		game.Roll(4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4);
		assertThat(game.Score(), is(80));
		
	}
	
	@Test
	public void ScoreOfRandom()
	{	
		game.Roll(1,3,8,1,7,3,2,4,10,4,3,10,10,2,8,10,10,10);
		assertThat(game.Score(), is(147));
		
	}
	

}

