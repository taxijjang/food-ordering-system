package com.food.ordering.system.domain.valueobject

import java.math.BigDecimal
import java.math.RoundingMode

data class Money(
    val amount: BigDecimal,
){
    fun isGreaterThanZero(): Boolean{
        return amount > BigDecimal.ZERO
    }

    fun isGreaterThen(money: Money): Boolean {
        return this.amount > money.amount
    }

    fun add(money: Money): Money {
        return Money(setScale(this.amount + money.amount))
    }

    fun subtract(money: Money): Money {
        return Money(setScale(this.amount - money.amount))
    }

    fun multiply(multiplier: BigDecimal): Money {
        return Money(setScale(this.amount * multiplier))
    }

    private fun setScale(input: BigDecimal): BigDecimal {
        return input.setScale(2, RoundingMode.HALF_EVEN)
    }
}