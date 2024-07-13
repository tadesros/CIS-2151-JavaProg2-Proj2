package proj2;

/**
 * Class Ghost
 * Extends Class Enemy
 */
public class Ghost extends Enemy{   

    /**
     * Constructor
     * @param weight
     * @param height 
     */
    public Ghost(int weight, int height) {
        
        super(weight, height);
    }
    /**
     * Abstract Method: Attack
     */
    @Override
    public void attack() {
      System.out.println("Boo!");
    }
      
} //end Ghost Class
