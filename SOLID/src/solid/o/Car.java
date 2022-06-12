/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.o;

/**
 *
 * @author isaac
 */
public class Car implements Vehicle {

    @Override
    public String getDraw() {
        String draw = "░░░░░░░░░░░░░░░░░░░░\n"
                + "░░░░░▄█▀▀█▀▀█▄░░░░░░\n"
                + "░░███████████████░░░\n"
                + "░░░▀▀0▀▀▀▀▀▀0▀▀▀░░░░\n"
                + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓";
        return draw;
    }

}
