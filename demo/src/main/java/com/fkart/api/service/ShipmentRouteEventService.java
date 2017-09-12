package com.fkart.api.service;

import com.fkart.api.dtos.ShipmentRouteEventDto;
import com.fkart.api.models.ShipmentRouteEvent;
import com.fkart.api.repository.ShipmentRouteEventRepository;
import com.fkart.api.service.mappers.ShipmentRouteEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Swapnil Bagadia
 */

@Service
public class ShipmentRouteEventService {

    @Autowired
    private ShipmentRouteEventRepository shipmentRouteEventRepository;

    @Autowired
    private ShipmentRouteEventMapper shipmentRouteEventMapper;

    public List<ShipmentRouteEventDto> getAllData(){
        return shipmentRouteEventMapper.toDtoList(shipmentRouteEventRepository.findAll());
    }

    public ShipmentRouteEventDto getData(Long routeEventId){
        return shipmentRouteEventMapper.toDto(shipmentRouteEventRepository.findOne(routeEventId));
    }


    public void updateShipmentRouteEvent(ShipmentRouteEventDto shipmentRouteEventDto){
        ShipmentRouteEvent event = shipmentRouteEventRepository.findOne(shipmentRouteEventDto.getRouteEventId());
        event = shipmentRouteEventMapper.updateEntity(event,shipmentRouteEventDto);
        shipmentRouteEventRepository.save(event);
    }


}
