package com.works.dto

import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountDto(

        val id:String?,
        val balance: BigDecimal?,
        val creation: LocalDateTime?,
        val customer: AccounCustomerDto?,
        val transactions: Set<TransactionDto>,

        )
