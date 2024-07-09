package proj2;

/**
 * Ghost Class
 * @author tomad
 */
public class Ghost extends Enemy{   

    public Ghost(int weight, int height) {
        super(weight, height);
    }

    @Override
    public void attack() {
      System.out.println("Boo!");
    }

} //end Ghost Class
