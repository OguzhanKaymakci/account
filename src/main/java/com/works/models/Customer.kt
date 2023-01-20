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




) {
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Customer

                if (id != other.id) return false
                if (name != other.name) return false
                if (surName != other.surName) return false

                return true
        }

        override fun hashCode(): Int {
                var result = id?.hashCode() ?: 0
                result = 31 * result + (name?.hashCode() ?: 0)
                result = 31 * result + (surName?.hashCode() ?: 0)
                return result
        }
}

