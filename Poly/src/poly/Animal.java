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
public abstract class Animal 
{
    protected int age;
    protected String color;
    
    public Animal(int age, String color)
    {
        this.age = age;
        this.color = color;
    } // end of Animal
    
    public void display()
    {
        System.out.printf("I am %d and my color is %s", age, color);        
    } // end of display
    
    public abstract void speak();       // no other stuff needed to make it abstract
//    {
////        System.out.println("I have no idea what to say");
//    } // end of speak
}

