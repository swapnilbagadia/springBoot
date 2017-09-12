package com.fkart.api.service.mappers;

import com.fkart.api.dtos.ShipmentRouteEventDto;
import com.fkart.api.models.ShipmentRouteEvent;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author Swapnil Bagadia
 */
@Mapper(componentModel = "spring")
public abstract class ShipmentRouteEventMapper {

    public abstract ShipmentRouteEventDto toDto(ShipmentRouteEvent shipmentRouteEvent);

    public abstract List<ShipmentRouteEventDto> toDtoList(List<ShipmentRouteEvent> shipmentRouteEventList);

    public ShipmentRouteEvent updateEntity(ShipmentRouteEvent event, ShipmentRouteEventDto dto){
        event.setRouteLegId(dto.getRouteLegId());
        event.setShipmentId(dto.getShipmentId());
        return event;
    }
}

