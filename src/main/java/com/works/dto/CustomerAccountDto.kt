package com.works.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class CustomerAccountDto(

        val id:String?,
        val balance: BigDecimal?,
        val creationDate: LocalDateTime?,
        val customer: AccounCustomerDto?,
        val transactions: Set<TransactionDto>,
