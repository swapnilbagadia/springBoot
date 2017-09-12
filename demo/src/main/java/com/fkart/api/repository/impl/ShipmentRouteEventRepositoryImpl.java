package com.fkart.api.repository.impl;

import com.fkart.api.repository.ShipmentRouteEventRepositoryCustom;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Swapnil Bagadia
 */
public class ShipmentRouteEventRepositoryImpl implements ShipmentRouteEventRepositoryCustom {

    @Autowired
    private JPAQueryFactory queryFactory;

}

