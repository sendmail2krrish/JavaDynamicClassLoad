package cars;

import java.util.ArrayList;

/**
 *
 * @author Krishna Paul
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
