/**
 * Class with simple flight information
 * 
 * @course CS203
 * @author Stephanie Irish Paladin
 * 200413341
 * Assignment 2
 * last modified: 11/02 2pm
 */

package Question6;
import java.util.GregorianCalendar;

public class Flight {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
    
    //constructor
    public Flight(String flightNo, GregorianCalendar departureTime,
            GregorianCalendar arrivalTime){
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the flightNo
     */
    public String getFlightNo() {
        return flightNo;
    }

    /**
     * @return the departureTime
     */
    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the arrivalTime
     */
    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(GregorianCalendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    
    public int getFlightTime(){
        return (int)(((getArrivalTime().getTimeInMillis()-
                getDepartureTime().getTimeInMillis())/1000)/60);
    }
}
