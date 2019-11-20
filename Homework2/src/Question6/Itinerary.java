/**
 * Class that uses ArrayList and has 
 * simple flight itinerary information
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/03 10pm
 */

package Question6;
import java.util.ArrayList;
import java.util.Comparator;

public class Itinerary{
    private ArrayList<Flight> flights = new ArrayList<>();
    
    public Itinerary( ArrayList<Flight> flights){
        this.flights = flights;
        java.util.Collections.sort(flights, new SortByDepartureTime());
    }
    
    /**
     * @returns the total flight time of the flight time in minutes
     * decimals are truncated
     */
    public int getTotalFlightTime(){
        int total = 0;
        for(Flight flight: flights){
            total += flight.getFlightTime();
        }
        return total;
    }
    
    /**
     * @returns the total travel time in minutes 
     * from the departure time of the ﬁrst ﬂight to the 
     * arrival time of the last ﬂight in the itinerary. 
     * Assume all the times are in the same time zone. 
     */
    
    public int getTotalTravelTime(){
        //difference in millis of 1st flight departure time 
        //and last flight arrival time
        int total =(int)(flights.get(flights.size()-1).getArrivalTime().getTimeInMillis() 
                -flights.get(0).getDepartureTime().getTimeInMillis());
        return (int)((total/1000)/60); 
    }

    
}

class SortByDepartureTime implements Comparator<Flight>{
    @Override
    public int compare(Flight f1, Flight f2) {
        return (int)(f1.getDepartureTime().getTimeInMillis()-f2.getDepartureTime().getTimeInMillis());
    }
}
