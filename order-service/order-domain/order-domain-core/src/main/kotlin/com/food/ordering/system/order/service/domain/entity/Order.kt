package com.food.ordering.system.order.service.domain.entity

import com.food.ordering.system.domain.entity.AggregateRoot
import com.food.ordering.system.domain.valueobject.*
import com.food.ordering.system.order.service.domain.valueobject.StreetAddress
import com.food.ordering.system.order.service.domain.valueobject.TrackingId

class Order(
    orderId: OrderId,
    val customerId: CustomerId,
    val restaurantId: RestaurantId,
    val deliveryAddress: StreetAddress,
    val price: Money,
    val items: List<OrderItem>,
    val trackingId: TrackingId,
    val orderStatus: OrderStatus,
    val failureMessage: List<String>,
) : AggregateRoot<OrderId>(
    orderId
) {

}