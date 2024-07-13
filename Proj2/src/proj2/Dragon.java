package proj2;

/**
 *  Class: Dragon
 *  Extends Enemy Class
 */
public class Dragon extends Enemy{   
    
    /**
     * Constructor
     * @param weight
     * @param height 
     */
    public Dragon(int weight, int height) {
        
        super(weight, height);
    }

    /**
     * Abstract Method : Attack
     */
    @Override
    public void attack() {
      System.out.println("Rawr!");
    }
} //end Dragon Class
