package com.works.models

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class Customer(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,

        val name: String?,
        val surName: String?,

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer", cascade = [CascadeType.ALL])
        val account: Set<Account>?




)

