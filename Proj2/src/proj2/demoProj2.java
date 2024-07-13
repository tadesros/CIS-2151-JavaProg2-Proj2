
package proj2;

/**
 * Class demoProj1
 * This class demonstrates the use of the abstract class Enemy
 * by creating an arrayList of Enemy objects of type Dragon,
 * Enemy, Ghost, Goblin, Ogre.
 * The type is randomized.
 */
public class demoProj2 {

   /**Constants**/
    
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
     
  //DRAGON
     private  static final int MIN_WEIGHT_DRAGON = 1000;
     private  static final int MAX_WEIGHT_DRAGON = 1500;
     
     private  static final int MIN_HEIGHT_DRAGON = 750;
     private  static final int MAX_HEIGHT_DRAGON = 2000;    
    
    /**
     * Method: Main
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
      //Declare an array of enemies of size enemy array size
        Enemy[] enemyArray = new Enemy[ENEMY_ARRAY_SIZE];     
       
      //Populate enemyArray with random Enemies
        populateEnemyArray(enemyArray);      
      
      //Print all of the enemies in enemy array with attack response
       printEnemyArray(enemyArray);      
      
    } //end Main
    
    
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
     * Method: PopulateEnemyArray
     * @param enemyArray 
     */
    static void populateEnemyArray(Enemy[] enemyArray)            
    {
      //Counter 
        int i = 0;        
        
      do
      {          
      //Get a random number for the Enemy type 1 to 4   
       int enemyType = generateRandomInt(1,4);
          
         switch(enemyType)
         {
           case 1 :
              // Goblin 
                enemyArray[i] = new Goblin(generateRandomInt(MIN_WEIGHT_GOBLIN, MAX_WEIGHT_GOBLIN),generateRandomInt(MIN_HEIGHT_GOBLIN , MAX_HEIGHT_GOBLIN));
              break; 

           case 2 :
              // Ghost
                enemyArray[i] = new Ghost(GHOST_WEIGHT,generateRandomInt(MIN_HEIGHT_GHOST , MAX_HEIGHT_GHOST));
              break;               
             
           case 3 :
              // Ogre
                enemyArray[i] = new Ogre(generateRandomInt(MIN_WEIGHT_OGRE, MAX_WEIGHT_OGRE),generateRandomInt(MIN_HEIGHT_OGRE , MAX_HEIGHT_OGRE));
              break;              
           
            case 4 :
              // Dragon
                 enemyArray[i] = new Dragon(generateRandomInt(MIN_WEIGHT_DRAGON, MAX_WEIGHT_DRAGON),generateRandomInt(MIN_HEIGHT_DRAGON , MAX_HEIGHT_DRAGON));
              break;        
           
           
           default : 
              // non of above
               System.out.println("Invalid");
         }
       
    
      
      //Increment i
      i++;
      
      }while(i < enemyArray.length);
      
    
    }
    
    /**
     * Method: Print enemy array
     * @param enemyArray 
     */
    static void printEnemyArray(Enemy[] enemyArray)
    {        
         for (Enemy enemyArray1 : enemyArray) {
             enemyArray1.attack();
         }      
    }
    
} //end demoProj2
