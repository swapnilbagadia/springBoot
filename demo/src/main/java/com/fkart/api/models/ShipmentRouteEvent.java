package com.fkart.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Swapnil Bagadia
 */

@Entity
@Table(name = "shipmentRouteEvent")
public class ShipmentRouteEvent {

    @Id
    @Column(name = "routeEventId")
    private Long routeEventId;

    @Column(name = "routeLegId")
    private Long routeLegId;

    @Column(name = "shipmentId")
    private String shipmentId;

    public Long getRouteEventId() {
        return routeEventId;
    }

    public void setRouteEventId(Long routeEventId) {
        this.routeEventId = routeEventId;
    }

    public Long getRouteLegId() {
        return routeLegId;
    }

    public void setRouteLegId(Long routeLegId) {
        this.routeLegId = routeLegId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
}
