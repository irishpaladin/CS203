/**
 * Class with cruise ship's basic information
 * which extends Ship
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question5;

public class CruiseShip extends Ship{
    private int passengerCapacity;
    
    public CruiseShip(String name, String yearBuilt, int passengerCapacity){
        super(name, yearBuilt);
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * @return the passengerCapacity
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * @param passengerCapacity the passengerCapacity to set
     */
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    
    @Override
    public String toString(){
        return "CruiseShip\nName: " + super.getName() + "\nPassenger Capacity: " 
                + this.getPassengerCapacity()+" persons";
    }

}
