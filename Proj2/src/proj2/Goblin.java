package proj2;

/**
 * Goblin Class
 * @author tomad
 */
public class Goblin extends Enemy{
    
    
    
       // Constructor of Child class GFG 
    Goblin() 
    { 
  
        // Super keyword refers to parent class 
        super(2,1); 
    } 
    
    
    
    
    /**
     * Method: Attack
     */
    public void attack()
    {
         System.out.println("Gurgle");
    }
    
    
} //end Goblin Class
