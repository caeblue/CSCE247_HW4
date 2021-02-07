
public abstract class Bike extends BikeStore{
    /**
     * Protected variables to build each variation of bike
     */
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Calls to all the methods to fill and display variables of 
     * the bike
     */
    public void createBike()
    {
        createFrame();
        addWheels();
        addPedals();
    }

    /**
     * Creates the type frame and displays it
     */
    private void createFrame()
    {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * Sees if there is wheels or training wheels to display
     */
    private void addWheels()
    {
        if(numWheels==0)
        {
            System.out.println("No wheels to add");
        }
        if(numWheels>0)
        {
            System.out.println("Adding " + numWheels + " wheel(s)");
        }
        if(hasTrainingWheels)
        {
            System.out.println("adding training wheels");
        }
    }
    /**
     * Boolean to see if there are pedals to add to the frame
     */
    private void addPedals()
    {
        if(hasPedals)
        {
            System.out.println("adding pedals");
        }
    }
    /**
     * Getting the end price for the custom bike
     * @return
     */
    public double getPrice()
    {
        System.out.println("Price: $" + price);
        return price;
    }
}
