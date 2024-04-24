package kras.springboot.learning.service

import kras.springboot.learning.datasource.BankDataSource
import kras.springboot.learning.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}