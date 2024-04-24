package kras.springboot.learning.datasource.mock

import kras.springboot.learning.datasource.BankDataSource
import kras.springboot.learning.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 17, 0.1),
        Bank("1", 1, 1.0),
        Bank("2", 2, 0.2),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBanks(accountNumber: String): Bank = banks.first { it.accountNumber == accountNumber }
}