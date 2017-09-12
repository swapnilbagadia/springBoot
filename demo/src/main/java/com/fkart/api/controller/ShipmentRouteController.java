package com.fkart.api.controller;

import com.fkart.api.dtos.ShipmentRouteEventDto;
import com.fkart.api.service.ShipmentRouteEventService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Swapnil Bagadia
 */

@RestController
@RequestMapping("/v1/shipment")
public class ShipmentRouteController {

    @Autowired
    private ShipmentRouteEventService shipmentRouteEventService;

    @ApiOperation("Get Shipment Route Event Data")
    @RequestMapping(method = RequestMethod.GET, value = "/shipment-route-event")
    public List<ShipmentRouteEventDto> getShipmentRouteData() {
        return shipmentRouteEventService.getAllData();
    }

    @ApiOperation("Get Shipment Route Event Data By RouteEventId")
    @RequestMapping(method = RequestMethod.GET, value = "/shipment-route-event/{routeEventId}")
    public ShipmentRouteEventDto getShipmentRouteData(@PathVariable("routeEventId") Long routeEventId) {
        return shipmentRouteEventService.getData(routeEventId);
    }

    @ApiOperation("Update Shipment Route Event Data By RouteEventId")
    @RequestMapping(method = RequestMethod.PUT, value = "/shipment-route-event")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void getShipmentRouteData(@RequestBody ShipmentRouteEventDto shipmentRouteEventDto) {
        shipmentRouteEventService.updateShipmentRouteEvent(shipmentRouteEventDto);
    }

}
