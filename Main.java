/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal2;
interface Animal2{
    void sound();
}
class cat implements Animal2{
    public void sound(){System.out.println("meow...");}
}
public class Main{
    
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
 
    }
        
}