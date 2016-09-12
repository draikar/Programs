import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PokemonPriceDetails {
   PokemonPriceBusinessLogic  pokemonPriceBusinessLogic = new PokemonPriceBusinessLogic();

   //test to check Pokemon Price
   @Test
   public void testCalculatePokemonPrice() {
      double value1 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(1,0,0);
      System.out.println("Purchased 1 Pikachu - "+value1);
      
      double value2 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(2,0,0);
      System.out.println("Purchased 2 Pikachu - "+value2);
      
      double value3 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(1,1,0);
      System.out.println("Purchased 1 Pikachu \n Purchased 1 Squirtle - "+value3);
      
      double value4 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(2,2,0);
      System.out.println("Purchased 2 Pikachu \n Purchased 2 Squirtle -"+value4);
      
      double value5 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(3,3,0);
      System.out.println("Purchased 3 Pikachu \n Purchased 3 Squirtle - "+value5);
      
      double value6 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(2,1,0);
      System.out.println("Purchased 2 Pikachu \n Purchased 1 Squirtle - "+value6);
      
      double value7 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(1,1,1);
      System.out.println("Purchased 1 Pikachu \n Purchased 1 Squirtle \n Purchased 1 Charmander - "+value7);
      
      double value8 = pokemonPriceBusinessLogic.calculateTotalPriceOfPokemons(2,1,1);
      System.out.println("Purchased 2 Pikachu \n Purchased 1 Squirtle \n Purchased 1 Charmander - "+value8);
   }
}