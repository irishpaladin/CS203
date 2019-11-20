/**
 * Program that test Flight and Itinerary classes
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/03 10pm
 */

package Question6;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestFlightItinerary{
    public static void main(String[] args){
        ArrayList<Flight> flights = new ArrayList<>();
        
        //adding values
        flights.add(new Flight("US230",
                new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US237",
                new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        flights.add(new Flight("US235",
                new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        
        Itinerary itinerary = new Itinerary(flights);
        //Displaying the arraylist
        for(Flight flight: flights){
            System.out.println("Flight number: "+ flight.getFlightNo());
            System.out.println("Departure time: "+ flight.getDepartureTime().getTime());
            System.out.println("Arrival time: "+ flight.getArrivalTime().getTime());
            System.out.println();
        }
        //Displays itinerary info
        System.out.println("Itinerary Information");
        System.out.println("Total flight time: " + itinerary.getTotalFlightTime());
        System.out.println("Total travel time: " + itinerary.getTotalTravelTime());
        
    }
}

