/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02;

/**
 *
 * @author HP
 */
public class ObjectTrapesium {
    public static void main(String[] args) {
        Trapesium trapesium = new Trapesium();
        trapesium.alasBawah = 25;
        trapesium.alasAtas = 18;
        trapesium.tinggi = 12;
        System.out.println("Luas = " + trapesium.luas());
    }

}
