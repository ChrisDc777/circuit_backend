package com.ar.circuit.controller

import com.ar.circuit.service.FileService
import org.springframework.core.io.ByteArrayResource
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/files")
class FileController(private val fileService: FileService) {

    @GetMapping("/{id}")
    fun getFileById(@PathVariable id: Long): ResponseEntity<ByteArrayResource> {
        val fileEntity = fileService.getFileById(id).orElse(null)
        val resource = ByteArrayResource(fileEntity?.data ?: byteArrayOf())

        return ResponseEntity.ok()
            .header("Content-Disposition", "attachment; filename=${fileEntity?.fileName ?: "file"}")
            .body(resource)
    }
}