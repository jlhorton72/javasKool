/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author jh0375800
 */
public class Fish extends Animal
{
    public Fish(int age, String color)
    {
        super(age,color);
    } // end of fish
    
    @Override
    public void speak()
    {
        System.out.println("I bubble.   BUBBLES!!");
    } // end of speak
    
    
    
} // end of fish class
