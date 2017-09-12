package com.fkart.api.service.mappers;

import com.fkart.api.dtos.ShipmentRouteEventDto;
import com.fkart.api.models.ShipmentRouteEvent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;

import java.util.List;

/**
 * @author Swapnil Bagadia
 */

//Null Value Check Strategy sets the value of target field only if correspondiong source field is not null - Important for PUT
@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface ShipmentRouteEventMapper {

    //Entity to Dto
    public ShipmentRouteEventDto toDto(ShipmentRouteEvent shipmentRouteEvent);

    public List<ShipmentRouteEventDto> toDtoList(List<ShipmentRouteEvent> shipmentRouteEventList);

    //DTO to Entity(Updation) ~ Does not create a new object, updates the one supplied with @MappingTarget annotation
    //@Mapping (target,ignore) is used to ignore updating the P_KEY, even by mistake even if the dto has non null value for it
    @Mapping(target = "routeEventId", ignore = true)
    public ShipmentRouteEvent updateEntity(ShipmentRouteEventDto dto, @MappingTarget ShipmentRouteEvent event);


}

