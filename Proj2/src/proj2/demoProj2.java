/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj2;

/**
 * @author tomad
 */
public class demoProj2 {

     //Constants
     private  static final int ENEMY_ARRAY_SIZE = 100;

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
    
                
      //Declare an array of enemies of size enemy array size
      Enemy[] enemyArray = new Enemy[ENEMY_ARRAY_SIZE];
      
       
      //Populate enemyArray with Enemies
      populateEnemyArray(enemyArray);      
      
      //Print Enemy Array
      printEnemyArray(enemyArray);
      
      
    
      
      
    // System.out.println(generateRandomInt(1,5));
      
      
    }
    
    
    /**
     * Function: generateRandomInt
     * @param min
     * @param max
     * @return 
     */
    static int generateRandomInt(int min, int max)
    {
      int randomNumber = (int)(Math.random() * (max + 1 - min) + min);
      
      return randomNumber;          
    }
    /**
     * 
     * @param enemyArray 
     */
    static void populateEnemyArray(Enemy[] enemyArray)
    {
      enemyArray[0] = new Ogre(1,2);
      enemyArray[1] = new Goblin(1,2);
      enemyArray[2] = new Ghost(1,2);   
    }
    
    /**
     * 
     * @param enemyArray 
     */
    static void printEnemyArray(Enemy[] enemyArray)
    {
        enemyArray[1].attack();
    }
    
} //end demoProj2
