/**
 * Class with ship's basic information 
 * I am not sure what should be the "appropriate" setter and getter so
 * I made setter and getter to all private variables
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question5;

public class Ship {
    private String name;
    private String yearBuilt;
    
    //constructor
    public Ship(String name, String yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the yearBuilt
     */
    public String getYearBuilt() {
        return yearBuilt;
    }

    /**
     * @param yearBuilt the yearBuilt to set
     */
    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
    
    @Override
    public String toString(){
        return "Ship\nName: " +getName()+"\nYear Built: "+getYearBuilt();
    }
}
