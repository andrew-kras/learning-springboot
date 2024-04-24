package kras.springboot.learning.datasource.mock

import kras.springboot.learning.datasource.BankDataSource
import kras.springboot.learning.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 17, 0.1),
        Bank("1000", 1, 0.9),
        Bank("7", 44, 0.5),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}