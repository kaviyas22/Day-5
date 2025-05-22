/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;
abstract class Animal{
    abstract void sound();
}
class cat extends Animal{
    void sound(){System.out.println("meow...");}
}
public class Main{
    
    public static void main(String[] args) {
        Animal c = new cat();
        c.sound();
        
    }
    
}
