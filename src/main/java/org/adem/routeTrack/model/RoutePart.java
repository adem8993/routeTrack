package org.adem.routeTrack.model;

import javax.persistence.Entity;

@Entity
public class RoutePart extends BaseModel {
    private Route route;
    private Location startLocation;
    private Location finishLocation;
    private Double length;

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getFinishLocation() {
        return finishLocation;
    }

    public void setFinishLocation(Location finishLocation) {
        this.finishLocation = finishLocation;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "RoutePart{" +
                "route=" + route +
                ", startLocation=" + startLocation +
                ", finishLocation=" + finishLocation +
                ", length=" + length +
                '}';
    }
}
