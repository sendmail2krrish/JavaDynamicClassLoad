/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

import java.util.ArrayList;

/**
 *
 * @author krishnapaul
 */
public class Lamborghini extends Car
{
    public ArrayList<String> start()
    {
        this.engine();
        this.doors();
        this.fuel();
        this.nitro();
        
        return this.status;
    }
    
    private void nitro()
    {
        this.status.add("Nitro loaded.");
    }
    
}
