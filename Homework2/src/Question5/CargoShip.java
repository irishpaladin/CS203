/**
 * Class with Cargo ship's basic information
 * which extends Ship
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question5;

public class CargoShip extends Ship{
    private int tonnage;
    
    public CargoShip(String name, String yearBuilt, int tonnage){
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    /**
     * @return the tonnage
     */
    public int getTonnage() {
        return tonnage;
    }

    /**
     * @param tonnage the tonnage to set
     */
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }
    
    @Override
    public String toString(){
        return "CargoShip\nName: " + super.getName() + "\nCargo Capacity: " 
                + this.getTonnage()+" tons";
    }
}
