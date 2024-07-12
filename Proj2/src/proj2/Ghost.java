/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
