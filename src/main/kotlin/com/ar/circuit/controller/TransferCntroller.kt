package com.ar.circuit.controller


import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/transfers")
class TransferController {

    @PostMapping("/new")
    fun newTransfer() {
        println("New")
    }


}