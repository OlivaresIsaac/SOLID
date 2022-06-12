/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.s;

/**
 *
 * @author isaac
 */
public class StorePrinter {
    Store store;

    public StorePrinter(Store store) {
        this.store = store;
    }
    
    public void printInConsole(){
        System.out.println(store.getName() + "\n" + "RIF: "+store.getRif()+"\n"+"Dirección: " +store.getDir());
    }
    
    public String printForUserInRows(){
        return store.getName() + "\n" + "RIF: "+store.getRif()+"\n"+"Dirección: " +store.getDir();
    }
    
    public String printForUserOneRow(){
        return store.getName() + " - " + "RIF: "+store.getRif()+" - "+"Dirección: " +store.getDir();
    }
}
