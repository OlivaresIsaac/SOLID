/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author isaac
 */
public class Main {

    private static final Functions app = new Functions();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Main.app.runApp();
    }
    
    public static Functions getApp() {
        return app;
    }

}
