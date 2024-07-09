package proj2;

/**
 * Ogre Class
 * @author tomad
 */
public class Ogre extends Enemy{   

    public Ogre(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void attack() {
      System.out.println("Ugh!");
    }

} //end Ogre Class