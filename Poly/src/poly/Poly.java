/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;
import java.util.ArrayList;
/**
 *
 * @author jh0375800
 */
public class Poly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Lion lion = new Lion(6, "beige");
        Fish fish = new Fish(2,"golden");
        Dog dog = new Dog(7,"black"); 
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(lion);
        aryAnimal.add(fish);
        aryAnimal.add(dog);        
        
        for (int i = 0; i < aryAnimal.size(); i++)
        {
            allSpeak(aryAnimal.get(i));
        } // end of foreach
        
//        Animal animal = new Animal(25,"purple");
//        AnimalSpeak(animal);
//        DogSpeak(dog);
//        FishSpeak(fish);
//        LionSpeak(lion);
//          allSpeak(animal);
//          allSpeak(dog);
//          allSpeak(fish);
//          allSpeak(lion);
          
        
        
    } // end of main
    
//    public static void LionSpeak(Lion lion)
//    {
//        lion.speak();
//    }
//    public static void FishSpeak(Fish fish)
//    {
//        fish.speak();
//    }
//    public static void DogSpeak(Dog dog)
//    {
//        dog.speak();
//    }
//    
//    public static void AnimalSpeak(Animal animal)
//    {
//        animal.speak();
//    }
//    
    public static void allSpeak(Animal animal)
    {
        animal.speak();
    }
    
    
}// end of Poly
