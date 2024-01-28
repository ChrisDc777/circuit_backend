package com.ar.circuit.service

import com.ar.circuit.model.FileEntity
import com.ar.circuit.repository.FileRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class FileService(private val fileRepository: FileRepository) {
    fun getFileById(id: Long): Optional<FileEntity> {
        return Optional.ofNullable(fileRepository.findEntityById(id))
    }
}