package proj2;

/**
 * Goblin Class
 * Extends class Enemy
 */
public class Goblin extends Enemy{   
    /**
     * Constructor Goblin
     * @param weight
     * @param height 
     */
    public Goblin(int weight, int height) {
        super(weight, height);
    }
    /**
     * Abstract method attack
     */
    @Override
    public void attack() {
      System.out.println("Gurgle!");
    }

} //end Goblin Class
