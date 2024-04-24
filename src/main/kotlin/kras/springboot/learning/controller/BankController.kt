package kras.springboot.learning.controller

import kras.springboot.learning.model.Bank
import kras.springboot.learning.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping()
    fun getBanks(): Collection<Bank> = service.getBanks()
//    fun getBanks(): String = "works"

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String) = service.getBank(accountNumber)
}