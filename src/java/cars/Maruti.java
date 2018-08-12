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
public class Maruti extends Car
{
    public ArrayList<String> start()
    {
        this.engine();
        this.doors();
        this.fuel();
        
        return this.status;
    }
}
