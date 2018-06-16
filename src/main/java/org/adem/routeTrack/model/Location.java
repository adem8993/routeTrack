package org.adem.routeTrack.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Location extends BaseModel {
    @NotNull
    private String name;
    @NotNull
    private float latitude;
    @NotNull
    private float longitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
