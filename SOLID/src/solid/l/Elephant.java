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
public class Elephant extends Animal{
    @Override
    public String walk(){
        return "El elefante caminó ... km";
    }
    @Override
    public String getName(){
        return "elefante";
    }
}
