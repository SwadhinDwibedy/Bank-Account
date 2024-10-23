package com.example.bankaccountbasic

fun main(){

    val swadhinBankAccount = BankAccount("Swadhin Dwibedy",25000.50)
    swadhinBankAccount.deposit(50000.00)
    swadhinBankAccount.withdraw(2500.00)
    swadhinBankAccount.deposit(500.00)
    swadhinBankAccount.withdraw(2700.00)
    swadhinBankAccount.deposit(500.00)
    swadhinBankAccount.withdraw(2520.00)

    swadhinBankAccount.displayTransactionHistory()
    println("${swadhinBankAccount.accountHolder}'s "+"balance is ${swadhinBankAccount.balance}")
}