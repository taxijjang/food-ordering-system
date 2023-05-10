package com.food.ordering.system.domain.entity

abstract class BaseEntity<ID> (
    val id: ID,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BaseEntity<*>) return false

        return id == other.id
    }

    override fun hashCode(): Int = id.hashCode()
}