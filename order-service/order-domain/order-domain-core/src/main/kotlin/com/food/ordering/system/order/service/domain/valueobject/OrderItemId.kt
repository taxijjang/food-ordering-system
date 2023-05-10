package com.food.ordering.system.order.service.domain.valueobject

import com.food.ordering.system.domain.valueobject.BaseId

data class OrderItemId(
    override val value: Long
) : BaseId<Long>(value) {

}
