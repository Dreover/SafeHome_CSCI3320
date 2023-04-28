/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dondrebanksoverton
 */
public class Lighting {
    private boolean state = false;
    private float brightness = 0;
    
    public void  turnOn(){
        if(!state){
            state = true;
            System.out.println("Turning on lights");
        }
    }
    
    public void  turnOff(){
        if(state){
            state = false;
            System.out.println("Turning off lights");
        }
    }    
}
