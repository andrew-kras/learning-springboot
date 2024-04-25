package kras.springboot.learning.datasource.mock

import kras.springboot.learning.datasource.BankDataSource
import kras.springboot.learning.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = mutableListOf(
        Bank("1234", 17, 0.1),
        Bank("1", 1, 1.0),
        Bank("2", 2, 0.2),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBanks(accountNumber: String): Bank =
        banks.firstOrNull { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could bot find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber}) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exist")
        }
        banks.add(bank)

        return bank
    }

    override fun updateBank(bank: Bank): Bank {
        val currentBank = banks.firstOrNull { it.accountNumber == bank.accountNumber }
            ?: throw NoSuchElementException("Could bot find a bank with account number ${bank.accountNumber}")

        banks.remove(currentBank)
        banks.add(bank)

        return bank
    }
}
