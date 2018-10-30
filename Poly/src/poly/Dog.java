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
public class Dog extends Animal 
{
    public Dog(int age, String color)
    {
        super(age,color);
    } // end of Dog
    
    @Override
    public void speak()
    {
        System.out.println("I bark!");
    } // end of speak
    
} // end of class
