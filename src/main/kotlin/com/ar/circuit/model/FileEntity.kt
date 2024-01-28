package com.ar.circuit.model


import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Lob

@Entity
data class FileEntity(
    @Id
    val id: Long,

    val fileName: String,

    @Lob
    val data: ByteArray
)
