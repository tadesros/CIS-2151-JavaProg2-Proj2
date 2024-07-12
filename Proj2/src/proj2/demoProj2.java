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

  //GOBLIN
     private  static final int MIN_WEIGHT_GOBLIN = 5;
     private  static final int MAX_WEIGHT_GOBLIN = 10;
     
     private  static final int MIN_HEIGHT_GOBLIN = 70;
     private  static final int MAX_HEIGHT_GOBLIN = 100;
     
  //GHOST
     private  static final int GHOST_WEIGHT = 0;
     
     private  static final int MIN_HEIGHT_GHOST = 90;
     private  static final int MAX_HEIGHT_GHOST = 150;
     
  //OGRE
     private  static final int MIN_WEIGHT_OGRE = 120;
     private  static final int MAX_WEIGHT_OGRE = 200;
     
     private  static final int MIN_HEIGHT_OGRE = 200;
     private  static final int MAX_HEIGHT_OGRE = 300;
    
    
    
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
      
       System.out.println(generateRandomInt(1,5));
      
      
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
      enemyArray[0] = new Ogre(generateRandomInt(MIN_WEIGHT_OGRE, MAX_WEIGHT_OGRE),generateRandomInt(MIN_HEIGHT_OGRE , MAX_HEIGHT_OGRE));
      enemyArray[1] = new Goblin(1,2);
      enemyArray[2] = new Dragon(1,2);   
    }
    
    /**
     * 
     * @param enemyArray 
     */
    static void printEnemyArray(Enemy[] enemyArray)
    {        
         for (Enemy enemyArray1 : enemyArray) {
             enemyArray1.attack();
         }      
    }
    
} //end demoProj2
