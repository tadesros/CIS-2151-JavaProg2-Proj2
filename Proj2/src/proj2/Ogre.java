package proj2;

/**
 * Ogre Class
 * extends abstract class Enemy
 */
public class Ogre extends Enemy{   
    /**
     * Constructor
     * @param weight
     * @param height 
     */
    public Ogre(int weight, int height) {
        super(weight, height);
    }
    /**
     * Abstract method attack
     */
    @Override
    public void attack() {
      System.out.println("Ugh!");
    }

} //end Ogre Class