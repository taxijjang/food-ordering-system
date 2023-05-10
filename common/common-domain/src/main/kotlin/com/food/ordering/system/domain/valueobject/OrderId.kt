package com.food.ordering.system.domain.valueobject

import java.util.UUID

abstract class OrderId(value: UUID) : BaseId<UUID>(value) {
}