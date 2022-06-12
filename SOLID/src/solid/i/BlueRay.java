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
public class BlueRay implements BasicProduct, ageRestriction {

    @Override
    public String getName() {
        return "Blueray...";
    }

    @Override
    public int getPrice() {
       return 15;
    }

    @Override
    public int getAgeRestriction() {
        return 16;
    }

    @Override
    public String getInfo() {
        String msg = getName()+"\n"+"Precio: $"+getPrice()+"\n"+"Edad mínima " + getAgeRestriction() + " años";
        return msg;
    }

}
