package kras.springboot.learning.datasource

import kras.springboot.learning.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}