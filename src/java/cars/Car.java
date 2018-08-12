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
class Car
{
    protected ArrayList<String> status = new ArrayList<>();

    protected void engine()
    {
        this.status.add("Engine started.");
    }

    protected void doors()
    {
        this.status.add("Doors are closed.");
    }

    protected void fuel()
    {
        this.status.add("Fuel loaded.");
    }
}
