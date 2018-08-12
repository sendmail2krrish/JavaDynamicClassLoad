package cars;

import java.util.ArrayList;

/**
 *
 * @author Krishna Paul
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
