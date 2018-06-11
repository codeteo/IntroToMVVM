package com.mvvm.intro.model

data class TipCalculation(
        val checkAmount: Double = 0.0,
        val tipPct: Int  = 0,
        val tipAmount: Double = 0.0,
        val grantTotal: Double = 0.0
)