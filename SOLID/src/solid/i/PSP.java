/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.i;

/**
 *
 * @author isaac
 */
public class PSP implements BasicProduct{

    @Override
    public String getInfo() {
        String msg = getName()+"\n"+"Precio: $"+getPrice();
       return msg;
    }

    @Override
    public String getName() {
        return "PSP";
    }

    @Override
    public int getPrice() {
         return 30;
    }
    
}