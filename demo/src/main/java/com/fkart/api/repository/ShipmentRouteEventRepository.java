package com.fkart.api.repository;

import com.fkart.api.models.ShipmentRouteEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Swapnil Bagadia
 */
@Repository
public interface ShipmentRouteEventRepository extends JpaRepository<ShipmentRouteEvent, Long>, ShipmentRouteEventRepositoryCustom {

    List<ShipmentRouteEvent> findAll();

    List<ShipmentRouteEvent> findAllByRouteEventId(List<Long> routeEventIdList);

    @Override
    ShipmentRouteEvent findOne(Long routeEventId);
}
