package org.adem.routeTrack.model;

import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class Record extends BaseModel {
    @ManyToOne
    private Route route;
    private Long duration;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "route=" + route +
                ", duration=" + duration +
                ", date=" + date +
                '}';
    }
}
