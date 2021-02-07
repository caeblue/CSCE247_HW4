public class BikeStore {
    /**
     * Creating the bike within the order
     * @param type
     * @return the new bike
     */
    public Bike orderBike(String type)
    {
        Bike bike=createBike(type);
        bike.createBike();
        bike.getPrice();
        return bike;
    }
 
    /**
     * seeing which bike type it is then calling to that bike children class
     * @param type
     * @return
     */
    private Bike createBike(String type)
    {
        if(type.equals("strider"))
        {
           return new Strider();
        }
        else if(type.equals("tricycle"))
        {
            return new Tricycle();
        }
        else
        {
           return new KidsBike();
        }
    
    }
    


}