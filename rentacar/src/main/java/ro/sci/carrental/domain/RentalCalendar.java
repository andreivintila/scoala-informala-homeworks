package ro.sci.carrental.domain;

import java.util.Date;

/**
 * Created by ADMIN on 18-May-17.
 */
public class RentalCalendar {

    private Date pickuptime;
    private Date returntime;

    public RentalCalendar(Date pickuptime, Date returntime) {
        this.pickuptime = pickuptime;
        this.returntime = returntime;
    }

    public Date getPickuptime() {
        return pickuptime;
    }

    public Date getReturntime() {
        return returntime;
    }
}
