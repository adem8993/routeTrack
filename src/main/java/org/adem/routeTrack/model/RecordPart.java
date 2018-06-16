package org.adem.routeTrack.model;

import javax.persistence.ManyToOne;

public class RecordPart extends BaseModel {
    @ManyToOne
    private Record record;
    @ManyToOne
    private RoutePart routePart;
    private Long duration;

    public Record getRecord() {
        return record;
    }

    public void setRecord(Record record) {
        this.record = record;
    }

    public RoutePart getRoutePart() {
        return routePart;
    }

    public void setRoutePart(RoutePart routePart) {
        this.routePart = routePart;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "RecordPart{" +
                "record=" + record +
                ", routePart=" + routePart +
                ", duration=" + duration +
                '}';
    }
}
