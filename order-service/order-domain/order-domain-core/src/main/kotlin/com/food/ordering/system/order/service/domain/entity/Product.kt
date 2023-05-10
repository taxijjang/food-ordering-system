package com.food.ordering.system.order.service.domain.entity

import com.food.ordering.system.domain.entity.BaseEntity
import com.food.ordering.system.domain.valueobject.Money
import com.food.ordering.system.domain.valueobject.ProductId

class Product(
    productId: ProductId,
    val name: String,
    val price: Money,
) : BaseEntity<ProductId>(productId) {

}
