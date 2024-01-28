package com.ar.circuit.repository

import com.ar.circuit.model.FileEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FileRepository : JpaRepository<FileEntity, Long> {
    fun findEntityById(id: Long): FileEntity?
}