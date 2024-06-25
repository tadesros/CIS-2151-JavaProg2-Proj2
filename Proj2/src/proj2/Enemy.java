/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proj2;

/**
 *  Enemy
 * @author tomad
 */
 abstract class Enemy {
    
    //Data
    int weight;
    int height;
   
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
     * Method: Attack
     */
    abstract void  attack();
    
    
    /** Getter and Setters **/
    
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    
    
} //end Enemy class
