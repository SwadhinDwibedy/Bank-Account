package com.example.bankaccountbasic

class BankAccount(var accountHolder:String,var balance:Double){
    private val transactionHistory = mutableListOf<String>()

    fun deposit(ammount:Double){
         balance += ammount
        transactionHistory.add("$accountHolder deposited $$ammount")
    }
    fun withdraw(ammount:Double){
        if (ammount <= balance) {
            balance -= ammount
            transactionHistory.add("$accountHolder withdraw $$ammount")

        }else{
            println("you dont have sufficient ammount to withdraw $$ammount")
        }
    }
    fun displayTransactionHistory(){
        println("transactin history for $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
    }
}