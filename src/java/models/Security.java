/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author dondrebanksoverton
 */
public class Security {
    private boolean armed = false;
    
    public void armDisarm(){
        if(!armed){
            armed = true;
            System.out.println("Arming system.");  
        }else{
            System.out.println("Disarming system.");
        }
    }
}
