package org.adem.routeTrack.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Route extends BaseModel {
    @ManyToOne
    private Location startLocation;
    @ManyToOne
    private Location finishLocation;
    private String description;
    private Double length;
    private String imagePath;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Route{" +
                "startLocation=" + startLocation +
                ", finishLocation=" + finishLocation +
                ", description='" + description + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
