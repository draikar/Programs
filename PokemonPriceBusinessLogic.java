public class PokemonPriceBusinessLogic {
	   // Calculate the Total Price Of Pokemon
	   public double calculateTotalPriceOfPokemons(int noOfPikachu,int squirtle, int charmander) {
	      double totalPrice = 0;
	      double discount;
	      
	      while(noOfPikachu != 0) {
	    	  if(squirtle != 0) {
	    		  while(squirtle != 0) {
	    			  if(charmander != 0) {
	    				  while(charmander != 0) {
	    					  discount = (6+5+5)*20;
	    					  discount = discount/100;
	    					  double tempTotalPrice = 6+5+5;
	    					  tempTotalPrice = tempTotalPrice - discount;
	    					  totalPrice = totalPrice+tempTotalPrice;
	    					  charmander--;
	    					  squirtle--;
	    					  noOfPikachu--;
	    					  break; 
	    				  }
	    			  }else {
	    				  discount = (6+5)*10;
	    				  discount = discount/100;
	    				  double tempTotalPrice = 6+5;
	    				  tempTotalPrice = tempTotalPrice - discount;
	    				  totalPrice = totalPrice+tempTotalPrice;
	    				  squirtle--;
	    				  noOfPikachu--;
	    				  break;
	    			  }
	    		  }
	    	  }else {
	    		  noOfPikachu--;
	    		  totalPrice  = totalPrice+6;
	    	  }
	    	  
	      }
	    
	      return totalPrice;
	   }
	}