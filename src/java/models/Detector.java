/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dondrebanksoverton
 */
public class Detector {
    private boolean fire = false;
    private boolean co2 = false;
    
    public static void detectFire(){
        System.out.println("Fire detected");
        
    }
    public static void detectCO2(){
        System.out.println("CO2 detected");
    }
}
