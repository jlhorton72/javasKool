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
public class Lion extends Animal
{
    public Lion(int age, String color)
    {
        super(age, color);
    } // end of lion
    
    @Override
    public void speak()
    {
        System.out.println("I am Lion!  Hear me ROAR!!!");
    } // end of speak
    
} // end of class Lion
