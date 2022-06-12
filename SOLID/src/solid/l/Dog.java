/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.l;

/**
 *
 * @author isaac
 */
public class Dog extends LightAnimal{
    @Override
    public String walk(){
        return "El perro caminó ... km";
    }
    @Override
    public String jump(){
        return "El perro saltó ... veces";
    }
}
