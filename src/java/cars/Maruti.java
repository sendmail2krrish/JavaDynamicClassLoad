package cars;

import java.util.ArrayList;

/**
 *
 * @author Krishna Paul
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
