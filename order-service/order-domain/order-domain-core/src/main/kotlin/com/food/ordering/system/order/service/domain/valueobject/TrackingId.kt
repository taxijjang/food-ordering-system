package com.food.ordering.system.order.service.domain.valueobject

import com.food.ordering.system.domain.valueobject.BaseId
import java.util.UUID

data class TrackingId(override val value: UUID) : BaseId<UUID>(value) {

}
