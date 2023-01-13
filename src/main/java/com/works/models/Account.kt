package com.works.models

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import javax.persistence.*
import javax.transaction.Transaction

@Entity
data class Account(
        @Id
        //Gerenic bir id olsun ve tahmin edilemesin bu id ler
        //?: Bu alan boş olabilir: Javadaki optional ile aynı: Birkaç tane conc üretiyor ve sen istediğini kullanabiliyorusn
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,
        val balance: BigDecimal? = BigDecimal.ZERO,
        val createionDate: LocalDateTime,


        @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JoinColumn(name = "Customer_id", nullable = false)
        val customer: Customer?,

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
        val transaction: Set<Transaction>




)
