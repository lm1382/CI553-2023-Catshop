package catalogue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * BetterBasket extends basket while enhancing multiple features such as item repetition and ordering
 * 
 * @author  Libby 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable, Comparator<Product>
{
  private static final long serialVersionUID = 1L;
  
  public BetterBasket()
  {
      super(); // Call the constructor of the superclass if needed
  }
  
 

  /*
  @Override
  public boolean add( Product p1 )
  { 
   
	  for (Product p2: this) {
		  if (p1.getProductNum().equals(p2.getProductNum())) {
			  p2.setQuantity(p2.getQuantity()+p1.getQuantity());
			  return(true);
		  }
	  }
	  
	  super.add(p1);
	  Collections.sort(this, this);
	  return(true);
  }
  
  public int compare(Product p1, Product p2) {
	  return p1.getProductNum().compareTo(p2.getProductNum());
	  
  }
  */
  
  @Override
  public boolean add(Product p1) {
      boolean itemExists = false; //assuming p1 is not in basket
      for (Product p2 : this) { //look at p2 in basket
          if (p1.getProductNum().equals(p2.getProductNum())) { //if product numbers are the same
              p2.setQuantity(p2.getQuantity() + p1.getQuantity()); //increase quantity 
              itemExists = true;
              break; // Exit the loop once the product is found
          }
      }
      if (!itemExists) { //if item not in basket -> add
          super.add(p1);
      }
      return true;
  }
  



@Override
public int compare(Product p1, Product p2) {
	// TODO Auto-generated method stub
	return 0;
}


  


  
}
  
  
  
  
  
  
  

	  
  
