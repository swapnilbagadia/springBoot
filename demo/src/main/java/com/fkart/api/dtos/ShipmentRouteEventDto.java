package com.fkart.api.dtos;

/**
 * @author Swapnil Bagadia
 */
public class ShipmentRouteEventDto {

    private Long routeEventId;

    private Long routeLegId;

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
