
package proj2;

/**
 *  Abstract Class: Enemy
 * 
 */
 public abstract class Enemy {
    
    //Data
    private int weight;
    private int height;
   
    /**
     * Constructor
     * @param weight
     * @param height 
     */
    public Enemy(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    /**
     * Abstract Method: Attack
     */
    public abstract void attack();
    
    
    /** Getter and Setters **/
     
    /** Get and set Weight
     * @return  */  
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /** Get and Set Height
     * @return  **/    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }    
    
} //end Enemy
