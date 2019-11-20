/**
 * Program that tests Ship, CargoShip, and CruiseShip classes
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question5;

public class TestShip {
    public static void main(String[] args){
        Ship[] ship = new Ship[3];
        ship[0] = new Ship("Lolipop","1960");
        ship[1] = new CruiseShip("Disney Magic", "1960", 2400);
        ship[2] = new CargoShip("Black Pearl", "2000", 50000);
        for(int i =0; i<3; i++){
            System.out.println(ship[i].toString());
            System.out.println();
            
        }
    }
}
